package com.sagiri.blog.dao.impl;

import com.sagiri.blog.dao.CommonDao;
import com.sagiri.blog.entity.Common;
import com.sagiri.blog.mapper.CommonMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 数据访问对象（DAO）实现类，用于操作common表
 *
 * @author Sagiri
 * @version 1.0
 * @since 2024/07/27
 *
 * @see CommonDao
 * @see CommonMapper
 */
@Repository
public class CommonDaoImpl implements CommonDao {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    /**
     * 获取common表中所有的问题
     *
     * @return 包含所有问题的列表。如果查询失败，则返回null。
     */
    @Override
    public List<Common> getProblem() {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            CommonMapper commonMapper = sqlSession.getMapper(CommonMapper.class);
            return commonMapper.getProblem();
        } catch (Exception e) {
            // 在日志中记录异常
            e.printStackTrace();
            return null;
        }
    }
}
