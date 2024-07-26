package com.sagiri.blog.dao;

import com.sagiri.blog.entity.Project;

import java.util.List;
/**
 * @author Sagiri
 * 创建于24/07/24
 * 此为对project表操作的dao层
 * getAllProject() 为获取project表的全部数据
 * 最后修改 24/07/24
 */
public interface ProjectDao {
    List<Project> getAllProject();//getAllProject() 为获取project表的全部数据
}
