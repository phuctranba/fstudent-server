package com.zipenter.fstudent.web.screens.userprofile;

import com.haulmont.cuba.gui.screen.*;
import com.zipenter.fstudent.entity.UserProfile;

@UiController("fstudent_UserProfile.browse")
@UiDescriptor("user-profile-browse.xml")
@LookupComponent("userProfilesTable")
@LoadDataBeforeShow
public class UserProfileBrowse extends StandardLookup<UserProfile> {
}