package com.ting.dao;

import com.ting.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Update("update user set status = #{status} where user_id = #{user_id}")
    int updateStatusByUid(@Param("status") int status, @Param("user_id") int uid);

    @Update("update user set status = #{password} where user_id = #{user_id}")
    int updatePasswordByUid(@Param("password") String password, @Param("user_id") int uid);


    @ResultType(Integer.class)
    @Select("select count(user_id) from user where username=#{username}")
    int selectUserByUsername(String username);


    int insert(User record);

    User selectByPrimaryKey(Integer userId);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

    @ResultMap("BaseResultMap")
    @Select("select * from user limit #{page},#{limit} ")
    List<User> page(@Param("page") Integer page, @Param("limit") Integer limit);

    @ResultType(Integer.class)
    @Select("select count(role_id) from user")
    int getCount();
}