package com.taoyuanmin.project.controller;

import com.taoyuanmin.project.utils.ResultUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    /**
     * 测试
     */
    @GetMapping("/test")
    public Object test() {
        return ResultUtil.success();
    }

    /**
     * 测试 异常
     */
    @GetMapping("/test/error")
    public Object testError() {
        int a = 1 / 0;
        return ResultUtil.success();
    }
}
