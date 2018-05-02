package com.ray.entity;

/**
 * @author Ray
 * @date 2018/5/2 0002
 * 图书类
 */
public class Book {

    private long bookId; // 图书ID
    private String name; // 图书名称
    private int number; // 馆藏数量

    // 构造方法，getter和setter方法，toString方法
    public Book() {
    }

    public Book(long bookId, String name, int number) {
        this.bookId = bookId;
        this.name = name;
        this.number = number;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
