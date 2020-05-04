package com.zipenter.fstudent.web.screens.school;

import com.haulmont.cuba.gui.screen.*;
import com.zipenter.fstudent.entity.School;

@UiController("fstudent_School.browse")
@UiDescriptor("school-browse.xml")
@LookupComponent("schoolsTable")
@LoadDataBeforeShow
public class SchoolBrowse extends StandardLookup<School> {
}