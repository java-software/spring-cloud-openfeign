package com.software.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @author gaohu9712@163.com
 * @date 2020/11/5
 * @description
 */
@Component
@FeignClient("ProviderServer")
public interface ProviderFeign {

    @GetMapping("/provider/get")
    public String get();
}
