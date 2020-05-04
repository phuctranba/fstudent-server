package com.zipenter.fstudent.web.screens.userprofile;

import com.haulmont.cuba.gui.screen.*;
import com.zipenter.fstudent.entity.UserProfile;

@UiController("fstudent_UserProfile.edit")
@UiDescriptor("user-profile-edit.xml")
@EditedEntityContainer("userProfileDc")
@LoadDataBeforeShow
public class UserProfileEdit extends StandardEditor<UserProfile> {
}