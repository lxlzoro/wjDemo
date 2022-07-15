package com.evan.wj.dao;

import com.evan.wj.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author liuxiaolei
 * @date 2022/6/17 16:08
 * @description：
 */
public interface CategoryDAO extends JpaRepository<Category, Integer> {

}
