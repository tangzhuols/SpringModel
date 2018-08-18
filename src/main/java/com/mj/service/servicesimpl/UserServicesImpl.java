package com.mj.service.servicesimpl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.mj.domain.Users;
import com.mj.mapper.UsersMapper;
import com.mj.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by：mingwang
 * Company：MJ
 * Date：2017/12/25
 */
@Service
public class UserServicesImpl extends ServiceImpl<UsersMapper, Users> implements UserServices {


    @Override
    public List<Users> SelectUserAll() {
        return baseMapper.SelectUserAll();
    }
}
