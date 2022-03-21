package com.only.nbi.platform.common.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 * @author :leiming5
 * @version :1.0
 * @createTime :2022/3/21 12:36
 */
@Getter
@Setter
@TableName("test_pk")
public class TestPk {
    @TableId
    private  int id;
    private String name;
}
