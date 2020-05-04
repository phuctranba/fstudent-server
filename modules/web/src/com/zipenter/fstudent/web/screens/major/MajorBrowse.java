package com.zipenter.fstudent.web.screens.major;

import com.haulmont.cuba.gui.screen.*;
import com.zipenter.fstudent.entity.Major;

@UiController("fstudent_Major.browse")
@UiDescriptor("major-browse.xml")
@LookupComponent("majorsTable")
@LoadDataBeforeShow
public class MajorBrowse extends StandardLookup<Major> {
}