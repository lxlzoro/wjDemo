package com.evan.wj.service;

import com.evan.wj.dao.CategoryDAO;
import com.evan.wj.pojo.Category;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liuxiaolei
 * @date 2022/8/9 15:16
 * @description：类别service
 */
@Service
@Slf4j
public class CategoryService {

    @Autowired
    private CategoryDAO categoryDAO;


    public List<Category> list() {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        return categoryDAO.findAll(sort);
    }

    public Category get(int id) {
        Category category = categoryDAO.findById(id).orElse(null);
        return category;
    }
}
