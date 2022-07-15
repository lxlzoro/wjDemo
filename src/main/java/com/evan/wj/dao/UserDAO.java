package com.evan.wj.dao;

import com.evan.wj.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author liuxiaolei
 * @date 2022/6/17 10:34
 * @description：
 */
public interface UserDAO extends JpaRepository<User, Integer> {
    /**
     * 通过用户名查询用户信息
     *
     * @param userName
     * @return
     */
    User findByUsername(String userName);

    /**
     * 通过用户名密码查询用户信息
     *
     * @param userName
     * @param password
     * @return
     */
    User getByUsernameAndPassword(String userName, String password);
}
