package com.sagiri.blog.controller;

import com.sagiri.blog.dto.Result;
import com.sagiri.blog.entity.Common;
import com.sagiri.blog.entity.Project;
import com.sagiri.blog.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 控制器类，用于处理与项目相关的请求
 *
 * @author Sagiri
 * @version 1.0
 * @since 2024/07/24
 */
@Controller
@RequestMapping("/blog/myProject")
public class MyProjectController {

    @Autowired
    private ProjectService projectService;

    /**
     * 处理访问myProject页面的请求
     *
     * @return 视图名称，用于重定向到myProject.jsp页面
     */
    @GetMapping("/myProject")
    public String myProject() {
        return "myProject";
    }

    /**
     * 获取所有项目数据
     *
     * @return 包含所有项目数据的列表。如果获取失败，则返回错误信息
     */
    @GetMapping("/getAllProject")
    @ResponseBody
    public Result getAllProject() {
        try {
            return Result.success(projectService.getAllProject());
        } catch (Exception e) {
            // 在日志中记录异常
            e.printStackTrace();
            return Result.error("获取失败: " + e.getMessage());
        }
    }
}
