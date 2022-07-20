package com.suiwei.service;


import com.suiwei.entity.Book;

public interface BooKService {

    //通过id获取图书信息
    Book getBookById(Integer id);

    void inventoryBookStock(Integer bookId, Integer num);
}
