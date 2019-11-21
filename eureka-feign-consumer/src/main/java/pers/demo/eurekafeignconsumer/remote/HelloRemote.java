package pers.demo.eurekafeignconsumer.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pers.demo.eurekafeignconsumer.hystrix.HelloRemoteHystrix;

/**
 * @Author: stsahana
 * @Date: 2019-9-6 13:04
 **/
@Component
@FeignClient(value= "spring-cloud-producer",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);

}
