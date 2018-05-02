package com.ray.entity;

import java.util.Date;

/**
 * @author Ray
 * @date 2018/5/2 0002\
 * 预约图书实体
 */
public class Appointment {

    private long bookId; // 图书ID
    private long studentId; // 学号
    private Date appointTime; // 预约时间

    // 多对一的复合属性
    private Book book; // 图书实体

    // 构造方法，getter和setter方法，toString方法
    public Appointment() {
    }

    public Appointment(long bookId, long studentId, Date appointTime, Book book) {
        this.bookId = bookId;
        this.studentId = studentId;
        this.appointTime = appointTime;
        this.book = book;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public Date getAppointTime() {
        return appointTime;
    }

    public void setAppointTime(Date appointTime) {
        this.appointTime = appointTime;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "bookId=" + bookId +
                ", studentId=" + studentId +
                ", appointTime=" + appointTime +
                ", book=" + book +
                '}';
    }
}
