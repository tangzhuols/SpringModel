package com.mj.domain;

/**
 * Created by：mingwang
 * Company：MJ
 * Date：2017/12/25
 */
public class UserStation extends BaseModel<UserStation> { //员工工位信息
    private int usID;//id
    private String usStation;//工位管理
    private int usUid;//--员工
    private String usRemark;//备注
    private Users users;
}
