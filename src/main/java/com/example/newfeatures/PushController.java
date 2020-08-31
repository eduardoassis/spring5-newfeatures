package com.example.newfeatures;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.PushBuilder;

@Controller
@RequestMapping("/push")
public class PushController {

    @GetMapping("with")
    public String demoWithPush(PushBuilder pushBuilder) {

        if (null != pushBuilder) {
            pushBuilder.path("/img/learn.png").push();
        }
        return "push";
    }


    @GetMapping("/without")
    public String demoWithoutPush(PushBuilder pushBuilder) {
        return "push";
    }
}
