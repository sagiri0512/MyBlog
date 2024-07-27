package com.sagiri.blog.mapper;

import com.sagiri.blog.entity.Common;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CommonMapper {
    @Select("SELECT id, problem FROM common")
    List<Common> getProblem();
}
