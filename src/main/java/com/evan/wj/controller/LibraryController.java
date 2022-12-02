package com.evan.wj.controller;

import com.evan.wj.pojo.Book;
import com.evan.wj.service.BookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liuxiaolei
 * @date 2022/8/9 15:38
 * @description：图书管理Controller
 */
@RestController
public class LibraryController {
    @Resource(name = "bookService")
    private BookService bookService;

    @CrossOrigin
    @GetMapping("/api/listBook")
    public List<Book> listBook() throws Exception {
        return bookService.list();
    }

    @CrossOrigin
    @PostMapping("/api/books")
    public Book saveOrUpdate(@RequestBody Book book) throws Exception {
        bookService.saveOrUpdate(book);
        return book;
    }

    @CrossOrigin
    @PostMapping("/api/delete")
    public void delete(Book book) throws Exception {
        bookService.deleteById(book.getId());
    }

    @CrossOrigin
    @GetMapping("/api/categories/{cid}/books")
    public List<Book> listByCategory(@PathVariable("cid") int cid) throws Exception {
        if (0 != cid) {
            return bookService.listByCategory(cid);
        } else {
            return new ArrayList<>();
        }
    }
}
