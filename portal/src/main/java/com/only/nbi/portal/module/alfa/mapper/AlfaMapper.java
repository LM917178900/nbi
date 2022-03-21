package com.only.nbi.portal.module.alfa.mapper;

import com.only.nbi.portal.module.alfa.domain.Alfa;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author :leiming5
 * @version :1.0
 * @createTime :2022/3/21 11:07
 */
@Repository
public interface AlfaMapper {

    Alfa getById(@Param("param") int id);
}
