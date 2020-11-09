package me.aki.springcloud.eurekaclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/svc")
    public String svcName() {
        List<String> svcs = discoveryClient.getServices();
        System.out.println(svcs);
        return String.join(",", svcs);
    }
}
