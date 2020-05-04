package com.zipenter.fstudent.web.screens.book;

import com.haulmont.cuba.gui.screen.*;
import com.zipenter.fstudent.entity.Book;

@UiController("fstudent_Book.edit")
@UiDescriptor("book-edit.xml")
@EditedEntityContainer("bookDc")
@LoadDataBeforeShow
public class BookEdit extends StandardEditor<Book> {
}