package com.ting.service;

import com.ting.entity.BusDto;
import com.ting.entity.Result;

import java.util.List;

/**
 * @author  孙菊红
 */
public interface ParklogService {
    Result selectByTypeOrName(String id, String useid, Integer page, Integer limit);


    Result seAll();

    List<BusDto> selectAll();
}
