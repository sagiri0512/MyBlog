package com.sagiri.blog.service.impl;

import com.sagiri.blog.dao.ProjectDao;
import com.sagiri.blog.entity.Project;
import com.sagiri.blog.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Sagiri
 * @version 1.0
 * @since 2024/07/24
 *
 * 此为对project表操作的service层的实现类
 * 实现ProjectService接口
 * getAllProject() 方法用于获取project表的全部数据
 * 自动注入ProjectDao
 *
 * @see ProjectDao
 * @see Project
 * @lastModified 2024/07/24
 */
@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectDao projectDao;

    /**
     * 获取所有的项目数据
     * @return 包含所有项目的列表
     * @see ProjectDao#getAllProject()
     */
    @Override
    public List<Project> getAllProject() {
        return projectDao.getAllProject();
    }
}
