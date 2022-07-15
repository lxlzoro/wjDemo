package com.evan.wj.excel;


import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.NumberFormat;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author liuxiaolei
 * @date 2022/7/15 13:11
 * @description：
 */
@Data
public class ExcelEntity implements Serializable {

    @ExcelProperty(value = {"主键id"})
    private Integer id;
    @ExcelProperty(value = {"金额"})
    @NumberFormat("###.##")
    private BigDecimal amount;
    @ExcelProperty(value = {"百分比"})
    @NumberFormat("###.##%")
    private BigDecimal amountRate;

}
