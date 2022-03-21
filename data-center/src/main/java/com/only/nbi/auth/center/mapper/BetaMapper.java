package com.only.nbi.auth.center.mapper;

import com.only.nbi.platform.common.model.TestPk;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author :leiming5
 * @version :1.0
 * @createTime :2022/3/21 12:46
 */
@Repository
public interface BetaMapper {
    TestPk getByName(@Param("param") String name);
}
