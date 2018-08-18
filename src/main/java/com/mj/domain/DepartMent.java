package com.mj.domain;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * Created by：mingwang
 * Company：MJ
 * Date：2017/12/22
 */
@TableName("department")
@Data
@EqualsAndHashCode(callSuper = false)
public class DepartMent extends BaseModel<DepartMent> {
    private int did;
    private String dName;/*--部门名称*/
    private String dUpName;//--上级部门
    private String dOne;//--经理
    private String dRemark;//--备注

}
