package com.sagiri.blog.controller;

import com.sagiri.blog.entity.Project;
import com.sagiri.blog.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
    @Autowired
    private ProjectService projectService;

    @GetMapping("/myProject")//myProject()用于重定向到myProject.jsp
    public String myProject(){
        return "myProject";
    }

    @GetMapping("/getAllProject")
    @ResponseBody
    public List<Project> getAllProject(){
        return projectService.getAllProject();
    }
}
