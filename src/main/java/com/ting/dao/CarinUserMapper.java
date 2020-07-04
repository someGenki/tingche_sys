package com.ting.dao;

import com.ting.pojo.CarinUser;
import com.ting.pojo.TollDto;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface CarinUserMapper {
    int deleteByPrimaryKey(Integer rkId);

    int insert(CarinUser record);

    CarinUser selectByPrimaryKey(Integer rkId);

    List<CarinUser> selectAll();

    //from 谢川东 加了1防止冲突
    List<TollDto> selectAll1(@Param("page") Integer page, @Param("limit") Integer limit);

    List<TollDto> selectByIDorPlate(@Param("userId") String userId, @Param("plate") String plate, @Param("page") Integer page, @Param("limit") Integer limit);

    Long getCount();

    int updateByPrimaryKey(CarinUser record);

    @Update("update parkinfo set current_use=current_use+1 where park_id=#{pid};")
    int addOne(Integer pid);
}