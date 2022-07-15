package com.evan.wj.dao;

import com.evan.wj.pojo.Book;
import com.evan.wj.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author liuxiaolei
 * @date 2022/6/17 16:08
 * @description：
 */
public interface BookDAO extends JpaRepository<Book, Integer> {
    /**
     *
     * @param category
     * @return
     */
    List<Book> findAllByCategory(Category category);

    /**
     *
     * @param keyword1
     * @param keyword2
     * @return
     */
    List<Book> findAllByTitleLikeOrAuthorLike(String keyword1, String keyword2);
}
