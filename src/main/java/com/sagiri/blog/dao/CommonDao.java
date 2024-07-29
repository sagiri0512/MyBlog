package com.sagiri.blog.dao;

import com.sagiri.blog.entity.Common;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 数据访问对象（DAO）接口，用于对common表进行操作
 *
 * @author Sagiri
 * @version 1.0
 * @since 2024/07/27
 *
 * @see Common
 */
public interface CommonDao {

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
