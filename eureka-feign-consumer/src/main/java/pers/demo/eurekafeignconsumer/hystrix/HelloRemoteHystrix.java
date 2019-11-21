package pers.demo.eurekafeignconsumer.hystrix;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import pers.demo.eurekafeignconsumer.remote.HelloRemote;

/**
 * @Author: stsahana
 * @Date: 2019-9-17 18:32
 **/
@Component
public class HelloRemoteHystrix implements HelloRemote {

  @Override
  public String hello(@RequestParam(value = "name") String name) {
    return "hello "+name+", this messge send failed ";
  }
}
