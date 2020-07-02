package com.ting.service.Impl;

import com.ting.dao.RoleMapper;
import com.ting.dao.UserMapper;
import com.ting.pojo.Role;
import com.ting.pojo.User;
import com.ting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper mapper;

    @Override
    public int count() {
        return mapper.getCount();
    }

    public boolean createUser(User u) {
        int insert = mapper.insert(u);
        return true;
    }

    @Override
    public List<User> selectByPage(Integer page, Integer limit) {
        page = (page - 1) * limit;
        return mapper.page(page, limit);
    }

    @Override
    public void updateStatus(int status, int uid) {
        mapper.updateStatusByUid(status, uid);
    }

    @Override
    public void updatePassword(String password, int uid) {
        mapper.updatePasswordByUid(password, uid);
    }

    @Override
    public int getByUsername(String username) {
        return mapper.selectUserByUsername(username);
    }

    @Override
    public String updateRole(int rid, int uid, int op_uid) {
        //先要获取操作者的uid,然后去找它的rid,然后去找它的权限等级,最后相比较,小不能改大
        User user = mapper.selectByPrimaryKey(uid);
        Integer rid1 = user.getRoleId();

        return null;
    }

}
