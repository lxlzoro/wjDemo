package com.evan.wj.excel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuxiaolei
 * @date 2022/7/15 13:14
 * @description：
 */
public class ExcelListener extends AnalysisEventListener<ExcelEntity> {
    @Autowired
    private UserNameService userNameService;

    /**
     * 提供ExcelListener的构造器 注入userService
     * @param userNameService
     */
    public ExcelListener(UserNameService userNameService) {
        this.userNameService = userNameService;
    }


    /**
     * 定义接受数据的list
     */
    List<ExcelEntity> list = new ArrayList<>();

    /**
     * 数据是一条一条读取的
     *
     * @param data
     * @param context
     */
    @Override
    public void invoke(ExcelEntity data, AnalysisContext context) {
        list.add(data);
        //这里做了批量插入的操作 所以在 doAfterAllAnalysed方法需要判断list是否为空 不为空的话需要再次插入 防止数据缺失
        if (list.size() == 10) {
            //执行插入操作
            userNameService.save(list);
            //清理list
            list.clear();
        }
    }


    /**
     * @param context
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        //不为空执行插入操作
        if (!CollectionUtils.isEmpty(list)) {
            //xx.save(list)
            userNameService.save(list);
            //清理list
            System.out.println(list);
            list.clear();
        }
    }

}
