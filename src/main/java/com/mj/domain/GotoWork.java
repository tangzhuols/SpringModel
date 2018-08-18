package com.mj.domain;


import lombok.Data;

import java.util.Date;

/**
 * Created by：mingwang
 * Company：MJ
 * Date：2017/12/25
 */
public class GotoWork extends BaseModel<GotoWork> {
    private int gid;//id
	private int gUid;//员工
    private Date gInWork;//上班时间
    private Date gOutWork;//下班时间
    private Date gAddWork;//加班打卡时间
    private Date gAoutWork;//加班下班打卡
    private int gTime;//加班时间
    private String tRemark;//备注
    private Users users;
}
