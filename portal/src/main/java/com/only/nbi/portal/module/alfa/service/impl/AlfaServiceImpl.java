package com.only.nbi.portal.module.alfa.service.impl;

import com.only.nbi.portal.module.alfa.domain.Alfa;
import com.only.nbi.portal.module.alfa.mapper.AlfaMapper;
import com.only.nbi.portal.module.alfa.service.AlfaService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author :leiming5
 * @version :1.0
 * @createTime :2022/3/21 11:18
 */
@Service
public class AlfaServiceImpl implements AlfaService {

    @Resource
    private AlfaMapper alfaMapper;

    @Override
    public Alfa getById(@Param("param") int id){
        Alfa byId = alfaMapper.getById(id);
        return byId;
    }
}
