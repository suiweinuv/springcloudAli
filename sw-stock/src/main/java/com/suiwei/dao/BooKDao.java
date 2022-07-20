package com.suiwei.dao;

import com.suiwei.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooKDao extends JpaRepository<Book, Integer> {
}
