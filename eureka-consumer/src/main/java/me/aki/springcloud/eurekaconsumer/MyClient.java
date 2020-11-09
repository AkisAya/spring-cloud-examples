package me.aki.springcloud.eurekaconsumer;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client")
public interface MyClient {

    @GetMapping("/svc")
    String consumer();
}
