package com.sagiri.blog.service;

import com.sagiri.blog.entity.Common;
import com.sagiri.blog.entity.Project;

import java.util.List;

/**
 * 提供对project表的服务层接口
 * 该接口定义了操作project表的方法
 *
 * @author Sagiri
 * @version 1.0
 * @since 2024/07/24
 *
 * @see Project
 *
 * 最后修改于 2024/07/24
 */
public interface ProjectService {

    /**
     * 获取project表中所有的数据
     *
     * @return 包含所有项目数据的列表
     */
    List<Project> getAllProject();
}
