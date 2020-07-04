package com.ting.service;


import com.ting.pojo.Parklog;
import com.ting.pojo.Result;

/**
 * @Author 谢川东
 */
public interface TollService {

    Result selectAll(Integer page, Integer limit);

    Result selectByIDorPlate(String userID, String plate, Integer page, Integer limit);

    Result createLog(Integer rid);


}
