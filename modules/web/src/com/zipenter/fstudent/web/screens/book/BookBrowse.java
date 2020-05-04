package com.zipenter.fstudent.web.screens.book;

import com.haulmont.cuba.gui.screen.*;
import com.zipenter.fstudent.entity.Book;

@UiController("fstudent_Book.browse")
@UiDescriptor("book-browse.xml")
@LookupComponent("booksTable")
@LoadDataBeforeShow
public class BookBrowse extends StandardLookup<Book> {
}