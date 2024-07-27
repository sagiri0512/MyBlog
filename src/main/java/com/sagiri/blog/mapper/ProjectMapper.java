package com.sagiri.blog.mapper;

import com.sagiri.blog.entity.Project;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * MyBatis Mapper 接口，用于对project表进行数据库操作
 *
 * @author Sagiri
 * @version 1.0
 * @since 2024/07/24
 *
 * @see Project
 */
@Mapper
public interface ProjectMapper {

    /**
     * 查询所有的项目数据
     *
     * @return 包含所有项目数据的列表
     */
    @Select("SELECT * FROM project")
    List<Project> getAllProject();
}
