package tech.sohocoder.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.sohocoder.Response;

@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(String name) {
        Response response = new Response();
        response.setCode("000000");
        response.setMessage(name);
        return JSON.toJSONString(response);
    }
}
