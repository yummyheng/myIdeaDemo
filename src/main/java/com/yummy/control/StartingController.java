package com.yummy.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liheng on 2017/2/9.
 */
@Controller
public class StartingController {
    @RequestMapping("login")
    public String login() {
        System.out.println("login");
        return "index";
    }

    @RequestMapping("loginout")
    public String loginout() {
        return "loginout";
    }

}
