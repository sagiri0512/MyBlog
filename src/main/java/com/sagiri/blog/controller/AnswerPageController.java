package com.sagiri.blog.controller;

import com.sagiri.blog.dto.Result;
import com.sagiri.blog.entity.Common;
import com.sagiri.blog.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 控制器类，用于处理展示问题和答案的请求
 *
 * @author Sagiri
 * @version 1.0
 * @since 2024/07/27
 * @see com.sagiri.blog.service.ProjectService
 */
@Controller
@RequestMapping("/blog/answerPage")
public class AnswerPageController {
    @Autowired
    private CommonService commonService;
    /**
     * 处理访问常用代码页面的请求
     *
     * @return 视图名称，用于重定向到answerPage.jsp页面
     */
    @GetMapping("/answerPage")
    public String answerPage(){
        return "answerPage";
    }
    /**
     * 获取问题和答案并跳转到answerPage.jsp页面
     * 使用请求域将问题和答案返回前端
     *
     * @param id   要查询的答案ID
     * @param req  HTTP请求对象
     * @param resp HTTP响应对象
     * @throws ServletException 处理Servlet请求时可能抛出的异常
     * @throws IOException      处理输入输出时可能抛出的异常
     */
    @GetMapping("/getAnswer")
    public void getAnswer(@RequestParam Integer id, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Common common = commonService.getAnswer(id);
            if(common == null){
                req.setAttribute("result", Result.error("未找到对应的答案"));
            }else{
                req.setAttribute("result", Result.success(common));
            }
        } catch (Exception e) {
            e.printStackTrace();
            req.setAttribute("result", Result.error("服务出错"));
        }
        req.getRequestDispatcher("answerPage").forward(req, resp);
    }
}
