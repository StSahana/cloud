package pers.demo.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: stsahana
 * @Date: 2019-9-6 11:45
 **/
@RestController
public class HelloController {
  @Value("${test.id}")
  private int id;

  @RequestMapping("/hello")
  public String hello(@RequestParam String name){
    return "hello "+name+"，this is "+id+" messge";
  }

}
