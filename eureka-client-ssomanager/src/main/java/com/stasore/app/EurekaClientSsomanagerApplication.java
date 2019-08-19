package com.stasore.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class EurekaClientSsomanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientSsomanagerApplication.class, args);
    }

    @RequestMapping("/as")
    @ResponseBody
    public String test(Model model){
        //返回一句话
        model.addAttribute("asd","asdfg");
        return "正式项目";
    }

}
