package com.sagiri.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Sagiri
 * 创建于24/07/24
 * 此Controller用于处理myProject.jsp页面的请求
 * myProject()用于重定向到myProject.jsp
 * 最后修改 24/07/24
 */
@Controller
@RequestMapping("/blog/myProject")
public class MyProjectController {
    @GetMapping("/myProject")
    public String myProject(){
        return "myProject";
    }
}
