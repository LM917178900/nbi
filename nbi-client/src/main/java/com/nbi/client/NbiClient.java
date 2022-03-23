package com.nbi.client;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

/**
 * @author :leiming5
 * @version :1.0
 * @createTime :2022/3/22 15:34
 */
@Component
public class NbiClient {
    @Resource
    private com.nbi.client.feign.NbiClient nbiClient;

    public String test() {
        String test = nbiClient.test();
        return test;
    }
}
