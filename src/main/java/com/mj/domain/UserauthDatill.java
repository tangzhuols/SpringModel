package com.mj.domain;

/**
 * Created by：mingwang
 * Company：MJ
 * Date：2017/12/25
 */
public class UserauthDatill extends BaseModel<UserauthDatill> {
    private int tid;
    private String taName;//权限明细名称
    private int taIdentifi;//权限明细标识
    private int taDid;//对应部门
    private int taAid;//权限
    private String taRemark;//备注
    private DepartMent departMent;//部门
    private Authority authority;//权限
}
