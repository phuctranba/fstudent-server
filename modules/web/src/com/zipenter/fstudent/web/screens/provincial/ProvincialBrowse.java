package com.zipenter.fstudent.web.screens.provincial;

import com.haulmont.cuba.gui.screen.*;
import com.zipenter.fstudent.entity.Provincial;

@UiController("fstudent_Provincial.browse")
@UiDescriptor("provincial-browse.xml")
@LookupComponent("provincialsTable")
@LoadDataBeforeShow
public class ProvincialBrowse extends StandardLookup<Provincial> {
}