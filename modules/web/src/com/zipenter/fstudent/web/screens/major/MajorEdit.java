package com.zipenter.fstudent.web.screens.major;

import com.haulmont.cuba.gui.screen.*;
import com.zipenter.fstudent.entity.Major;

@UiController("fstudent_Major.edit")
@UiDescriptor("major-edit.xml")
@EditedEntityContainer("majorDc")
@LoadDataBeforeShow
public class MajorEdit extends StandardEditor<Major> {
}