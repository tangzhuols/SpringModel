package com.mj.domain;

/**
 * Created by：mingwang
 * Company：MJ
 * Date：2017/12/25
 */
public class AuthdaTill extends BaseModel<AuthdaTill> {
    private int tid;
    private String tName;//权限明细名称
    private String tIdentifi;//权限明细标识
    private int tAid;//权限
    private String tRemark;//备注
    private Authority authority;
}
