package com.mj.domain;

/**
 * Created by：mingwang
 * Company：MJ
 * Date：2017/12/25
 */
public class Authority extends BaseModel<Authority> {
    private int aid;
    private String aName;//菜单名称
    private String aTable;//表名称
    private int aRank ;//菜单级别
    private int aIdentifi ;//最高级菜单标识，不对外开放
    private String aRemarkv;//--备注
}
