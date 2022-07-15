package com.evan.wj.controller;

import com.evan.wj.pojo.User;
import com.evan.wj.result.Result;
import com.evan.wj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpSession;

/**
 * @author liuxiaolei
 * @date 2022/6/16 16:02
 * @description：用户登录Controller
 */
@Controller
public class LoginContrller {

    @Autowired
    private UserService userService;

    @CrossOrigin(allowCredentials = "true")
    @PostMapping(value = "/api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser, HttpSession session) {
        // 对html标签进行转义，防止xss攻击
        String userName = requestUser.getUsername();
        userName = HtmlUtils.htmlEscape(userName);
        User user = userService.get(userName, requestUser.getPassword());
        if (null == user) {
            return new Result(400);
        } else {
            session.setAttribute("user", user);
            return new Result(200);
        }
    }

    @CrossOrigin
    @GetMapping(value = "/api/index")
    @ResponseBody
    public String index() {
        return "Hello world";
    }
}
