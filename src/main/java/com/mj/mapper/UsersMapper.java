package com.mj.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.service.IService;
import com.mj.domain.Users;
import org.apache.ibatis.annotations.Results;

import java.util.List;

/**
 * Created by：mingwang
 * Company：MJ
 * Date：2017/12/25
 */
public interface UsersMapper extends BaseMapper<Users> {
    /**
     * 查询所有的用户
     *
     * @return
     */
    List<Users> SelectUserAll();

}
