package org.note.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/g")
public class TestRouteController {

    @GetMapping("/p")
    public String g(@RequestParam("p") String p) {
        System.out.println("gateway param=" + p);
        return "gateway:" + p;
    }


}
