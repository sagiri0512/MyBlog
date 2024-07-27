package com.sagiri.blog.dao.impl;

import com.sagiri.blog.dao.ProjectDao;
import com.sagiri.blog.entity.Project;
import com.sagiri.blog.mapper.ProjectMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
/**
 * @author Sagiri
 * 创建于24/07/24
 * 此为对project表操作的dao层的impl类
 * getAllProject() 为获取project表的全部数据
 * 最后修改 24/07/24
 */
@Repository
public class ProjectDaoImpl implements ProjectDao {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Override
    public List<Project> getAllProject() {//getAllProject() 为获取project表的全部数据
        try(SqlSession sqlSession = sqlSessionFactory.openSession()){
            ProjectMapper projectMapper =   sqlSession.getMapper(ProjectMapper.class);
            return projectMapper.getAllProject();
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
}
