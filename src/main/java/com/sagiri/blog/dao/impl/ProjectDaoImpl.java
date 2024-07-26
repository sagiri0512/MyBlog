package com.sagiri.blog.dao.impl;

import com.sagiri.blog.dao.ProjectDao;
import com.sagiri.blog.entity.Project;
import com.sagiri.blog.mapper.ProjectMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
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
    static SqlSessionFactory sqlSessionFactory;
    public ProjectDaoImpl() {
        try {
            setUp();
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
    private void setUp() throws IOException {//找配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }


    @Override
    public List<Project> getAllProject() {//getAllProject() 为获取project表的全部数据
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ProjectMapper projectMapper =   sqlSession.getMapper(ProjectMapper.class);
        try{
            return projectMapper.getAllProject();
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
}
