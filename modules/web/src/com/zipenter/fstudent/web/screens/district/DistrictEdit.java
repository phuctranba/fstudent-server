package com.zipenter.fstudent.web.screens.district;

import com.haulmont.cuba.gui.screen.*;
import com.zipenter.fstudent.entity.District;

@UiController("fstudent_District.edit")
@UiDescriptor("district-edit.xml")
@EditedEntityContainer("districtDc")
@LoadDataBeforeShow
public class DistrictEdit extends StandardEditor<District> {
}