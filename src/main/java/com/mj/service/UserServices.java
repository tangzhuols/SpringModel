package com.mj.service;

import com.baomidou.mybatisplus.service.IService;
import com.mj.domain.Users;

import java.util.List;

/**
 * Created by：mingwang
 * Company：MJ
 * Date：2017/12/25
 */
public interface UserServices extends IService<Users>{
    List<Users> SelectUserAll();
}
