package com.study.SpringBoot.forezp.c13cache;

import java.util.Random;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.study.pojo.Book;

@Component
public class SimpleBookRepository implements BookRepository {

    @Override
    @Cacheable("books")//这个方法开启了缓存策略,缓存key为books
    public Book getBook(String name) {
        simulateSlowService();
        Random random = new Random();
        return new Book(random.nextInt(),name, random.nextDouble());
    }

    // Don't do this at home
    private void simulateSlowService() {
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

}