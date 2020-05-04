package com.zipenter.fstudent.web.screens.bookcase;

import com.haulmont.cuba.gui.screen.*;
import com.zipenter.fstudent.entity.BookCase;

@UiController("fstudent_BookCase.browse")
@UiDescriptor("book-case-browse.xml")
@LookupComponent("bookCasesTable")
@LoadDataBeforeShow
public class BookCaseBrowse extends StandardLookup<BookCase> {
}