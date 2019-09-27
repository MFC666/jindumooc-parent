package com.jindumooc.user.service;

import com.jindumooc.dto.user.Fans;
import com.jindumooc.vojo.user.PersonalDetail;

public interface PersonalInformation {
    PersonalDetail getPersonalDetail(int userId);

    String updatePersonalDetail(PersonalDetail personalDetail);

    String followedUser(Fans fans);

    Object delFollowedUser(Fans fans);
}
