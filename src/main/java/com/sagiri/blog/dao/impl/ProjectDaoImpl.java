package com.sagiri.blog.dao.impl;

import com.sagiri.blog.dao.ProjectDao;
import com.sagiri.blog.entity.Project;
import com.sagiri.blog.mapper.ProjectMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 数据访问对象（DAO）实现类，用于操作project表
 *
 * @author Sagiri
 * @version 1.0
 * @since 2024/07/24
 *
 * @see ProjectDao
 * @see ProjectMapper
 */
@Repository
public class ProjectDaoImpl implements ProjectDao {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    /**
     * 获取project表中所有的项目数据
     *
     * @return 包含所有项目数据的列表。如果查询失败，则返回null。
     */
    @Override
    public List<Project> getAllProject() {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            ProjectMapper projectMapper = sqlSession.getMapper(ProjectMapper.class);
            return projectMapper.getAllProject();
        } catch (Exception e) {
            // 在日志中记录异常
            e.printStackTrace();
            return null;
        }
    }
}
