package com.sagiri.blog.dao;

import com.sagiri.blog.entity.Common;

import java.util.List;

/**
 * 数据访问对象（DAO）接口，用于对common表进行操作
 *
 * @author Sagiri
 * @version 1.0
 * @since 2024/07/27
 *
 * @see Common
 */
public interface CommonDao {

    /**
     * 获取common表中所有的问题
     *
     * @return 包含所有问题的列表
     */
    List<Common> getProblem();
}
