package com.sagiri.blog.service;

import com.sagiri.blog.entity.Common;
import java.util.List;

/**
 * 提供对common表的服务层接口
 * 该接口定义了操作common表的方法
 *
 * @author Sagiri
 * @version 1.0
 * @since 2024/07/27
 *
 * @see Common
 *
 * 最后修改于 2024/07/27
 */
public interface CommonService {

    /**
     * 获取common表中所有的问题
     *
     * @return 包含所有问题的列表
     */
    List<Common> getProblem();
}
