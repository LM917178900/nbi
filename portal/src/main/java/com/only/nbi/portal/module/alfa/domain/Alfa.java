package com.only.nbi.portal.module.alfa.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 * @author :leiming5
 * @version :1.0
 * @createTime :2022/3/21 11:06
 */
@Getter
@Setter
@TableName("alfa")
public class Alfa {
    @TableId
    private int id;
    private String name;
}
