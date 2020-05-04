package com.zipenter.fstudent.web.screens.provincial;

import com.haulmont.cuba.gui.screen.*;
import com.zipenter.fstudent.entity.Provincial;

@UiController("fstudent_Provincial.edit")
@UiDescriptor("provincial-edit.xml")
@EditedEntityContainer("provincialDc")
@LoadDataBeforeShow
public class ProvincialEdit extends StandardEditor<Provincial> {
}