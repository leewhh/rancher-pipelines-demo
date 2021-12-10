package com.haoger.rpd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Description: None
 * Created on 2021/12/10 3:08 下午
 *
 * @author Wenhao.Lee
 * @version 1.0
 */
@RestController
public class HelloController {

    @GetMapping("/hello-world")
    public String helloWorld() throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        return "hello world! Ip:" + address.getHostAddress() + ",HostName:" + address.getHostName();
    }

}
