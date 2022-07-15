package com.evan.wj.excel;

import com.alibaba.excel.EasyExcel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;

/**
 * @author liuxiaolei
 * @date 2022/7/15 13:21
 * @description：
 */
@Controller
@Slf4j
public class UserController {
    @Autowired
    private UserNameService userNameService;

    @PostMapping("/importExcel")
    public void importExcel(MultipartFile file) throws Exception {
        InputStream inputStream = file.getInputStream();
        //new ExcelListener(userService) 传入注入的service
        EasyExcel.read(inputStream, ExcelEntity.class, new ExcelListener(userNameService)).sheet(0).doRead();
    }
}
