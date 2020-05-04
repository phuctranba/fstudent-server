package com.zipenter.fstudent.web.screens.district;

import com.haulmont.cuba.gui.screen.*;
import com.zipenter.fstudent.entity.District;

@UiController("fstudent_District.browse")
@UiDescriptor("district-browse.xml")
@LookupComponent("districtsTable")
@LoadDataBeforeShow
public class DistrictBrowse extends StandardLookup<District> {
}