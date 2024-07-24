package com.sagiri.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Sagiri
 * 24/07/24
 * 此Controller为访问根目录时跳转到首页 index页
 * 最后修改 24/07/24
 */
@Controller
public class RedirectController {
    @RequestMapping("/")
    public String redirectToIndex() {
        return "redirect:/blog/index/index";
    }
}
