package com.hongz.springmvc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

@Controller
public class HelloWorld {
    @RequestMapping("/helloworld")
    @ResponseBody
    public String hello() {
        System.out.println("hello world");
        UserInfo u1 = new UserInfo(1, "xiaoming");
        UserInfo u2 = new UserInfo(2, "xiaoli");
        Map<String, UserInfo> map = new HashMap<>();
        map.put("01", u1);
        map.put("02", u2);
        List<UserInfo> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);
        String jsonString = JSON.toJSONString(map);
        return jsonString;

    }
}
