package com.nbi.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author :leiming5
 * @version :1.0
 * @createTime :2022/3/22 15:35
 */
@FeignClient(name = "nbi-client")
public interface NbiClient {
    @GetMapping("/test1")
    String test() ;
}
