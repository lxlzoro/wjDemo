package com.evan.wj.excel;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liuxiaolei
 * @date 2022/7/15 13:16
 * @description：
 */
@Service
@Slf4j
public class UserNameService {

    public void save(List<ExcelEntity> list) {
        if (list.size() > 0) {
            System.out.println(list);
        }
    }
}
