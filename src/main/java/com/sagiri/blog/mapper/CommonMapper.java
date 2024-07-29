package com.sagiri.blog.mapper;

import com.sagiri.blog.entity.Common;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * MyBatis Mapper 接口，用于对common表进行数据库操作
 *
 * @author Sagiri
 * @version 1.0
 * @since 2024/07/27
 *
 * @see Common
 */
@Mapper
public interface CommonMapper {

    /**
     * 查询common表中的所有问题
     *
     * @return 包含所有问题的列表，每个问题包含id和问题描述
     */
    @Select("SELECT id, problem FROM common")
    List<Common> getProblem();
    /**
     * 获取问题和答案
     * @param id 问题的 ID
     * @return 问题和答案。如果查询失败，则返回null。
     */
    @Select("SELECT * FROM common WHERE id = #{id}")
    Common getAnswer(@Param("id") Integer id);
    /**
     * 使用LIKE查询获取问题信息
     *
     * @param problem 用于匹配的关键字
     * @return 包含匹配问题的 Common 对象列表
     */
    @Select("SELECT id, problem FROM common WHERE problem LIKE CONCAT('%', #{problem}, '%')")
    List<Common> getLikeProblem(@Param("problem") String problem);
}
