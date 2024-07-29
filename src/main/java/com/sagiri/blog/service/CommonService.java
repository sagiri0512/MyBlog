package com.sagiri.blog.service;

import com.sagiri.blog.entity.Common;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 提供对common表的服务层接口
 * 该接口定义了操作common表的方法
 *
 * @author Sagiri
 * @version 1.0
 * @since 2024/07/27
 *
 * @see Common
 *
 * 最后修改于 2024/07/27
 */
public interface CommonService {

    /**
     * 获取common表中所有的问题
     *
     * @return 包含所有问题的列表
     */
    List<Common> getProblem();
    /**
     * 获取问题和答案
     * @param id 问题的 ID
     * @return 问题和答案
     */
    Common getAnswer(Integer id);
    /**
     * 使用LIKE查询获取问题信息
     *
     * @param problem 用于匹配的关键字
     * @return 包含匹配问题的 Common 对象列表
     */
    List<Common> getLikeProblem(String problem);
}
