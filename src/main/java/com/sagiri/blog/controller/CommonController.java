package com.sagiri.blog.controller;

import com.sagiri.blog.dto.Result;
import com.sagiri.blog.entity.Common;
import com.sagiri.blog.service.CommonService; // 注入服务层，用于获取常用代码
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 控制器类，用于处理常用代码相关的请求
 *
 * @author Sagiri
 * @version 1.0
 * @since 2024/07/27
 */
@Controller
@RequestMapping("/blog/common")
public class CommonController {

    @Autowired
    private CommonService commonService; // 注入CommonService，用于获取常用代码

    /**
     * 处理访问常用代码页面的请求
     *
     * @return 视图名称，用于重定向到common.jsp页面
     */
    @GetMapping("/common")
    public String common() {
        return "common";
    }

    /**
     * 获取常用代码中的所有问题
     *
     * @return 包含所有问题的结果对象。如果获取失败，则返回错误信息
     */
    @GetMapping("/getProblem")
    @ResponseBody
    public Result getProblem() {
        try {
            return Result.success(commonService.getProblem());
        } catch (Exception e) {
            // 在日志中记录异常
            e.printStackTrace();
            return Result.error("获取失败: " + e.getMessage());
        }
    }
    /**
     * 获取按关键字搜索的内容
     *
     * @return 包含搜索问题的结果对象。如果获取失败，则返回错误信息
     */
    @GetMapping("/getLikeProblem")
    @ResponseBody
    public Result getLikeProblem(@RequestParam String problem){
        try {
            return Result.success(commonService.getLikeProblem(problem));
        } catch (Exception e) {
            // 在日志中记录异常
            e.printStackTrace();
            return Result.error("获取失败: " + e.getMessage());
        }
    }
}
