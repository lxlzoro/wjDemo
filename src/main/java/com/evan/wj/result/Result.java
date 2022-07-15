package com.evan.wj.result;

import lombok.Data;

/**
 * @author liuxiaolei
 * @date 2022/6/16 15:59
 * @description：
 */
@Data
public class Result {
    //响应码
    private int code;

    public Result(int code) {
        this.code = code;
    }

}
