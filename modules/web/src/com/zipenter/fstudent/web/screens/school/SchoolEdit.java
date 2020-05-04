package com.zipenter.fstudent.web.screens.school;

import com.haulmont.cuba.gui.screen.*;
import com.zipenter.fstudent.entity.School;

@UiController("fstudent_School.edit")
@UiDescriptor("school-edit.xml")
@EditedEntityContainer("schoolDc")
@LoadDataBeforeShow
public class SchoolEdit extends StandardEditor<School> {
}