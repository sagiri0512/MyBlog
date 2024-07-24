package com.sagiri.blog.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @author Sagiri
 * 创建于24/07/24
 * 此Controller为主页相关的请求
 * index()为重定向到index.jsp
 * 最后修改 24/07/24
 */
@Controller
@RequestMapping("/blog/index")
public class IndexController {
    @GetMapping("/index")//index()为重定向到index.jsp
    public String index(){
        return "index";
    }
}
