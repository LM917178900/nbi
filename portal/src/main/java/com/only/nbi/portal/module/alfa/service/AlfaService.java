package com.only.nbi.portal.module.alfa.service;

import com.only.nbi.portal.module.alfa.domain.Alfa;
import org.apache.ibatis.annotations.Param;

/**
 * @author :leiming5
 * @version :1.0
 * @createTime :2022/3/21 11:18
 */
public interface AlfaService {

    Alfa getById(@Param("param") int id);
}
