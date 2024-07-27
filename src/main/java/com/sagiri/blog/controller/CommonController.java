package com.sagiri.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Sagiri
 * 创建于24/07/27
 * 此Controller为常用代码相关的请求
 * conmmon()为重定向到conmmon.jsp
 * 最后修改 24/07/27
 */
@Controller
@RequestMapping("/blog/common")
public class CommonController {
    @GetMapping("/common")
    public String common(){
        return "common";
    }
}
