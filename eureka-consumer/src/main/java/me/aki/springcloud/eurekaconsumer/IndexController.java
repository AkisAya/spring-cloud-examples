package me.aki.springcloud.eurekaconsumer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private MyClient myClient;


    @GetMapping("/consume")
    public String consume() {
        return myClient.consumer();
    }
}
