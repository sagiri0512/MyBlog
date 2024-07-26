package com.sagiri.blog.mapper;

import com.sagiri.blog.entity.Project;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface ProjectMapper {
    @Select("SELECT * FROM project")
    List<Project> getAllProject();
}
