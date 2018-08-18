package com.mj.domain;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * Created by：mingwang
 * Company：MJ
 * Date：2017/12/25
 */
@TableName("users")
@Data
@EqualsAndHashCode(callSuper = false)
public class Users extends BaseModel<Users> {
    private int uid;//id
    private String uName;//员工姓名
    private String uNumber;//--员工编号
    private String uPhone;//员工电话
    private String uPosition;//--职位
    private Date uInTime;//-入职时间
    private int uAge;//员工年龄
    private int uStading;//-工作年龄
    private int uDid;//--部门
    private int uIdentifi;//--员工标识
    private String uRemark;//--备注
    private String upassword;//--密码
    private DepartMent departMent;
}
