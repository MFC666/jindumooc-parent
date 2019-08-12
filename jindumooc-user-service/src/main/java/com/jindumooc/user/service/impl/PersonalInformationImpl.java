package com.jindumooc.user.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.jindumooc.dao.FriendMapper;
import com.jindumooc.dao.UserProfileMapper;
import com.jindumooc.dto.user.Fans;
import com.jindumooc.pojo.Friend;
import com.jindumooc.pojo.FriendExample;
import com.jindumooc.pojo.UserProfileExample;
import com.jindumooc.user.service.PersonalInformation;
import com.jindumooc.vojo.user.PersonalDetail;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

@Service
public class PersonalInformationImpl implements PersonalInformation {

    @Autowired
    private UserProfileMapper  userProfileMapper;

    @Autowired
    private FriendMapper friendMapper;
    /**
     * 获取个人信息
     * @param userId
     * @return
     */
    @Override
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

    @Override
    public String followedUser(Fans fans) {
        try{
            Friend friend = new Friend();
            friend.setCreatedtime(new Long((new Date()).getTime()).intValue());
            friend.setFromid(fans.getFromId());
            friend.setToid(fans.getToId());
            friend.setPair(null);
            friendMapper.insert(friend);
            return "关注成功";
        }catch (Exception e){
            return "关注失败";
        }
    }
}
