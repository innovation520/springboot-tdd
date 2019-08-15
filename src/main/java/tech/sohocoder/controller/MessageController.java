package tech.sohocoder.controller;

import com.alibaba.fastjson.JSON;
import tech.sohocoder.service.MessageService;
import tech.sohocoder.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/getMessage")
    public String getMessage(int type) {
        Response response = new Response();
        if(type > 1) {
            response.setCode("000001");
            response.setMessage("Invalid Parameter");
            return JSON.toJSONString(response);
        }
        response.setCode("000000");
        System.out.println(messageService.getMessage(type));
        response.setMessage(messageService.getMessage(type));
        return JSON.toJSONString(response);
    }

}
