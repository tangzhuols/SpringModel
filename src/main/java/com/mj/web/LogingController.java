package com.mj.web;

import com.mj.domain.Users;
import com.mj.service.UserServices;
import com.mj.util.ResultVM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by：mingwang
 * Company：MJ
 * Date：2017/12/25
 */
@RestController
@RequestMapping("/api")
public class LogingController extends  BaseController<UserServices,Users>{
    @GetMapping("/login")
    public ResultVM login(){
        List<Users> list = service.SelectUserAll();
        return ResultVM.ok(list);
    }
}
