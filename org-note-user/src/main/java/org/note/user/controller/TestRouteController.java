package org.note.user.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/u")
public class TestRouteController {

    @GetMapping("/u")
    public String g(@RequestParam("u") String u) {
        System.out.println("mdm2 param7777");
//        System.out.println("mdm2 param=" + u + 3/0);
        return "user:" + u;
    }


}
