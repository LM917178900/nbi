package com.only.nbi.auth.center.service;

import com.only.nbi.platform.common.model.TestPk;

/**
 * @author :leiming5
 * @version :1.0
 * @createTime :2022/3/21 12:38
 */
public interface BetaService {
    TestPk getByName(String name);
}
