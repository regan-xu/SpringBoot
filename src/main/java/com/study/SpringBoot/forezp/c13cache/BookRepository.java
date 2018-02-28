package com.study.SpringBoot.forezp.c13cache;

import com.study.pojo.Book;

public interface BookRepository {
    Book getBook(String name);
}
