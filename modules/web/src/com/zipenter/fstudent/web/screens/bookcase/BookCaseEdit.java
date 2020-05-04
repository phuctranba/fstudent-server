package com.zipenter.fstudent.web.screens.bookcase;

import com.haulmont.cuba.gui.screen.*;
import com.zipenter.fstudent.entity.BookCase;

@UiController("fstudent_BookCase.edit")
@UiDescriptor("book-case-edit.xml")
@EditedEntityContainer("bookCaseDc")
@LoadDataBeforeShow
public class BookCaseEdit extends StandardEditor<BookCase> {
}