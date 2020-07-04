package com.ting.dao;

import com.ting.pojo.Role;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(Role record);

    Role selectByPrimaryKey(Integer roleId);

    @ResultMap("BaseResultMap")
    @Select("select * from role limit #{page},#{limit} ")
    List<Role> page(@Param("page") Integer page, @Param("limit") Integer limit);

    List<Role> selectAll();

    @ResultType(Integer.class)
    @Select("select count(role_id) from role")
    int getCount();

    int updateByPrimaryKey(Role record);
}