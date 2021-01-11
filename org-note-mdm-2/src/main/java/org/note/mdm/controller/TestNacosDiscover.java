package org.note.mdm.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/m2")
public class TestNacosDiscover {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    private RestTemplate restTemplate = new RestTemplate();


    @GetMapping("/u")
    public String g(@RequestParam("mu") String mu) {
        ServiceInstance choose = loadBalancerClient.choose("org-note-user");
        String url = String.format("http://%s:%s/org-note-user/u/u?u=%s", choose.getHost(), choose.getPort(), mu);
        System.out.println(url);
        String forObject = restTemplate.getForObject(url, String.class);
        System.out.println(forObject);
        return forObject;
    }
}
