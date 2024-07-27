package com.sagiri.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制器类，用于处理根目录的请求并重定向到首页
 *
 * @author Sagiri
 * @version 1.0
 * @since 2024/07/24
 */
@Controller
public class RedirectController {

    /**
     * 处理根目录请求，将用户重定向到博客首页
     *
     * @return 重定向到首页的视图名称
     */
    @RequestMapping("/")
    public String redirectToIndex() {
        return "redirect:/blog/index/index";
    }
}
