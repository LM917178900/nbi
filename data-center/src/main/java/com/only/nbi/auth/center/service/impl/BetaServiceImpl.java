package com.only.nbi.auth.center.service.impl;

import com.only.nbi.auth.center.mapper.BetaMapper;
import com.only.nbi.auth.center.service.BetaService;
import com.only.nbi.platform.common.model.TestPk;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author :leiming5
 * @version :1.0
 * @createTime :2022/3/21 12:38
 */
@Service
public class BetaServiceImpl implements BetaService {

    @Resource
    private BetaMapper betaMapper;


    @Override
    public TestPk getByName(String name){
       TestPk testPk =  betaMapper.getByName(name);
        return testPk;
    }
}
