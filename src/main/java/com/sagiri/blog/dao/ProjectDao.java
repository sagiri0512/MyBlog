package com.sagiri.blog.dao;

import com.sagiri.blog.entity.Project;

import java.util.List;

/**
 * 数据访问对象（DAO）接口，用于对project表进行操作
 *
 * @author Sagiri
 * @version 1.0
 * @since 2024/07/24
 *
 * @see Project
 */
public interface ProjectDao {

    /**
     * 获取project表中所有的项目数据
     *
     * @return 包含所有项目数据的列表
     */
    List<Project> getAllProject();
}
