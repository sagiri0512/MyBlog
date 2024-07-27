package com.sagiri.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制器类，用于处理主页相关的请求
 *
 * @author Sagiri
 * @version 1.0
 * @since 2024/07/24
 */
@Controller
@RequestMapping("/blog/index")
public class IndexController {

    /**
     * 处理主页请求，将用户重定向到index.jsp页面
     *
     * @return 视图名称，用于重定向到index.jsp页面
     */
    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
