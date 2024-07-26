package com.sagiri.blog.service.impl;

import com.sagiri.blog.dao.ProjectDao;
import com.sagiri.blog.dao.impl.ProjectDaoImpl;
import com.sagiri.blog.entity.Project;
import com.sagiri.blog.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author Sagiri
 * 创建于24/07/24
 * 此为对project表操作的service层的impl类
 * getAllProject() 为获取project表的全部数据
 * 最后修改 24/07/24
 */
@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectDao projectDao;
    @Override
    public List<Project> getAllProject() {//getAllProject() 为获取project表的全部数据
        return projectDao.getAllProject();
    }
}
