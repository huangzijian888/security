package cn.huangzijian888.security.controller;

import cn.huangzijian888.security.service.MethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangzijian888
 */
@RestController
public class HelloController {

    @Autowired
    MethodService methodService;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Security";
    }

    @RequestMapping("/admin/hello")
    public String admin() {
        return "Hello admin";
    }

    @RequestMapping("/user/hello")
    public String user() {
        return "Hello user";
    }

    @RequestMapping("/login")
    public String login() {
        return "please login!";
    }

    @GetMapping("/hello1")
    public String hello1() {
        return methodService.admin();
    }

    @GetMapping("/hello2")
    public String hello2() {
        return methodService.user();
    }

    @GetMapping("/hello3")
    public String hello3() {
        return methodService.hello();
    }

}
