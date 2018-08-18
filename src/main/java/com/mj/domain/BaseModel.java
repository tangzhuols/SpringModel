package com.mj.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by：mingwang
 * Company：MJ
 * Date：2017/12/25
 * 通用实体
 */
@Data
@EqualsAndHashCode(callSuper = false)
public abstract class BaseModel<T extends BaseModel> implements Serializable {
    private static final long serialVersionUID = 1L;
    private String createUserId;
    private Date createTime;
    private String updateUserId;
    private Date updateTime;
    protected Serializable pkVal() {
        // TODO Auto-generated method stub
        return createUserId;
    }
}
