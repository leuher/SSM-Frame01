package com.ray;

import com.ray.dao.BookDao;
import com.ray.entity.Book;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Ray
 * @date 2018/5/2 0002
 */
public class BookDaoTest extends BaseTest {

    @Autowired
    private BookDao bookDao;

    @Test
    public void testQueryById(){
        long bookId = 1000;
        Book book = bookDao.queryById(bookId);
        System.out.println(book);
    }

    @Test
    public void testQueryAll(){
        List<Book> books = bookDao.queryAll(0,4);
        for (Book book :
                books) {
            System.out.println(book);
        }
    }

    @Test
    public void testReduceNumber(){
        long bookId = 1000;
        int update = bookDao.reduceNumber(bookId);
        System.out.println("update= " + update);

        Book book = bookDao.queryById(bookId);
        System.out.println(book);
    }
}
