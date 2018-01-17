package com.gralll.repost.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "wall-service")
public interface WallClient {

    @RequestMapping(method = RequestMethod.GET, value = "wall/post", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    String getSomething();
}
