package pers.demo.eurekafeignconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.demo.eurekafeignconsumer.remote.HelloRemote;

/**
 * @Author: stsahana
 * @Date: 2019-9-6 13:06
 **/
@RestController
public class ConsumerController {
  @Autowired
  private HelloRemote helloRemote;

  @RequestMapping("/hello/{name}")
  public String index(@PathVariable("name") String name) {
    return helloRemote.hello(name);
  }

}
