package com.jindumooc.user.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.jindumooc.dao.*;
import com.jindumooc.dto.user.Fans;
import com.jindumooc.pojo.*;
import com.jindumooc.user.service.PersonalInformation;
import com.jindumooc.vojo.user.Messages;
import com.jindumooc.vojo.user.PersonalDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class PersonalInformationImpl implements PersonalInformation {

    @Autowired
    private UserProfileMapper  userProfileMapper;

    @Autowired
    private FriendMapper friendMapper;

    @Autowired
    private NotificationMapper notificationMapper;

    @Autowired
    private MessageConversationMapper messageConversationMapper;

    @Autowired
    private MessageMapper messageMapper;

    @Autowired
    private MessageRelationMapper messageRelationMapper;
    /**
     * 获取个人信息
     * @param userId
     * @return
     */
    @Override
    @Transactional
    public PersonalDetail getPersonalDetail(int userId) {

        PersonalDetail personalDetail = userProfileMapper.getPersonalDetail(userId);
        FriendExample friendExample = new FriendExample();
        FriendExample.Criteria fansCriteria = friendExample.createCriteria();
        fansCriteria.andFromidEqualTo(userId);
        int fansNum = friendMapper.countByExample(friendExample);
        FriendExample.Criteria followedCriteria = friendExample.createCriteria();
        followedCriteria.andFromidEqualTo(userId);
        int followedNum = friendMapper.countByExample(friendExample);
        personalDetail.setFansNum(fansNum);
        personalDetail.setFollowedNum(followedNum);
        return personalDetail;
    }

    /**
     * 修改个人信息
     * @param personalDetail
     * @return
     */
    @Override
    public String updatePersonalDetail(PersonalDetail personalDetail) {
        return userProfileMapper.updatePersonalDetail(personalDetail);
    }

    /**
     * 关注用户
     * @param fans
     * @return
     */
    @Override
    public String followedUser(Fans fans) {
        try{
            Friend friend = new Friend();
            friend.setCreatedtime(new Long((new Date()).getTime()).intValue());
            friend.setFromid(fans.getFromId());
            friend.setToid(fans.getToId());
            friend.setPair(null);
            friendMapper.insert(friend);
            Notification notification = new Notification();
            notification.setBatchid(0);
            notification.setIsread(false);
            notification.setType("user-follow");
            notification.setUserid(fans.getToId());
            notification.setCreatedtime((int)(new Date().getTime() / 1000));
            notification.setContent("{\"userId\":\"27\",\"userName\":\"\u8463\u5353\u7136\u6d4b\u8bd5\u8d26\u53f7\",\"opration\":\"follow\"}");
            notificationMapper.insert(notification);
            return "关注成功";
        }catch (Exception e){
            return "关注失败";
        }
    }

    /**
     * 取消关注
     * @param fans
     * @return
     */
    @Override
    public Object delFollowedUser(Fans fans) {

        FriendExample friendExample = new FriendExample();

        FriendExample.Criteria criteria = friendExample.createCriteria();

        criteria.andToidEqualTo(fans.getToId());

        criteria.andFromidEqualTo(fans.getFromId());

        friendMapper.deleteByExample(friendExample);

        notificationMapper.delFollowedUser(fans);

        return "取关成功";
    }

    @Override
    public Object sendMessage(Messages messages) {

        MessageConversationExample messageConversationExample = new MessageConversationExample();

        MessageConversationExample.Criteria criteria = messageConversationExample.createCriteria();

        criteria.andFromidEqualTo(messages.getFromId());

        criteria.andToidEqualTo(messages.getToId());

        List<MessageConversation> messageConversations = messageConversationMapper.selectByExample(messageConversationExample);

        criteria.andToidEqualTo(messages.getFromId());

        criteria.andFromidEqualTo(messages.getToId());

        List<MessageConversation> messageConversationList = messageConversationMapper.selectByExample(messageConversationExample);

        int maxMessageId = messageMapper.getMaxId();

        int maxMessageConversationId = messageConversationMapper.getMaxId();

        MessageRelationExample messageRelationExample = new MessageRelationExample();

        MessageRelationExample.Criteria messageRelationCriteria = messageRelationExample.createCriteria();

        Message message = new Message();

        message.setFromid(messages.getFromId());

        messages.setToId(messages.getToId());

        message.setId(maxMessageId+1);

        message.setIsdelete(0);

        message.setContent(messages.getContent());

        message.setType("text");

        message.setCreatedtime((int)(new Date().getTime() / 1000));

        messageMapper.insert(message);

        MessageConversation messageConversation = new MessageConversation();

        messageConversation.setLatestmessagecontent(messages.getContent());

        messageConversation.setLatestmessageuserid(messages.getFromId());

        messageConversation.setLatestmessagetime((int)(new Date().getTime() / 1000));
        if(0==messageConversations.size()){
            //首次进行私信


            messageConversation.setFromid(messages.getFromId());

            messageConversation.setCreatedtime((int)(new Date().getTime() / 1000));

            messageConversation.setToid(messages.getToId());

            messageConversation.setLatestmessagetype("text");

            messageConversation.setMessagenum(1);

            messageConversation.setUnreadnum(1);

            messageConversation.setId(maxMessageConversationId+1);

            messageConversationMapper.insert(messageConversation);

            messageConversation.setToid(messages.getFromId());

            messageConversation.setFromid(messages.getToId());

            messageConversation.setId(maxMessageConversationId+2);

            messageConversationMapper.insert(messageConversation);

            MessageRelation messageRelation = new MessageRelation();

            messageRelation.setConversationid(maxMessageConversationId+1);

            messageRelation.setMessageid(maxMessageId+1);

            messageRelationMapper.insert(messageRelation);

            messageRelation.setConversationid(maxMessageConversationId+2);

            messageRelationMapper.insert(messageRelation);

        }else{

            MessageConversationExample mCExample = new MessageConversationExample();

            MessageConversationExample.Criteria mCC = mCExample.createCriteria();

            mCC.andIdEqualTo(messageConversations.get(0).getId());

            messageConversation.setMessagenum(messageConversations.get(0).getMessagenum()+1);

            messageConversation.setUnreadnum(messageConversations.get(0).getUnreadnum()+1);

            messageConversation.setId(messageConversations.get(0).getId());

            messageConversationMapper.updateByExampleSelective(messageConversation,mCExample);

            mCC.andIdEqualTo(messageConversationList.get(0).getId());

            messageConversationMapper.updateByExampleSelective(messageConversation,mCExample);

            MessageRelation messageRelation = new MessageRelation();

            messageRelation.setConversationid(messageConversations.get(0).getId());

            messageRelation.setMessageid(maxMessageId+1);

            messageRelationMapper.insert(messageRelation);

            messageRelation.setConversationid(messageConversationList.get(0).getId());

            messageRelationMapper.insert(messageRelation);
        }

        return "插入成功";
    }
}
