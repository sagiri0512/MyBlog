package com.sagiri.blog.service.impl;

import com.sagiri.blog.dao.CommonDao;
import com.sagiri.blog.entity.Common;
import com.sagiri.blog.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 实现CommonService接口的服务层实现类
 * 负责处理与common表相关的操作
 *
 * @author Sagiri
 * @version 1.0
 * @since 2024/07/27
 *
 * @see CommonDao
 * @see Common
 * @see CommonService
 *
 * 最后修改于 2024/07/27
 */
@Service
public class CommonServiceImpl implements CommonService {

    @Autowired
    private CommonDao commonDao;

    /**
     * 获取common表中所有的问题
     *
     * @return 包含所有问题的列表
     * @see CommonDao#getProblem()
     */
    @Override
    public List<Common> getProblem() {
        return commonDao.getProblem();
    }

    /**
     * 获取问题和答案
     * @param id 问题的 ID
     * @return 问题和答案
     */
    @Override
    public Common getAnswer(Integer id) {
        return commonDao.getAnswer(id);
    }
    /**
     * 使用LIKE查询获取问题信息
     *
     * @param problem 用于匹配的关键字
     * @return 包含匹配问题的 Common 对象列表
     */
    @Override
    public List<Common> getLikeProblem(String problem) {
        return commonDao.getLikeProblem(problem);
    }
}
