package com.sagiri.blog.mapper;

import com.sagiri.blog.entity.Common;
import org.apache.ibatis.annotations.Mapper;
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
}
