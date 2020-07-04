package com.ting.service.Impl;

import com.ting.dao.ParkinfoMapper;
import com.ting.pojo.Parkinfo;
import com.ting.service.ParkinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkinfoServiceImpl  implements ParkinfoService {
    @Autowired
    ParkinfoMapper mapper;


    @Override
    public Parkinfo getParkInfo(Integer pid) {
        return mapper.selectByPrimaryKey(pid);

    }
}
