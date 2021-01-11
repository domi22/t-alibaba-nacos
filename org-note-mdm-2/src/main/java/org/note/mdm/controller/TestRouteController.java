package org.note.mdm.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/m")
public class TestRouteController {

    @GetMapping("/m")
    public String g(@RequestParam("m") String m) {
//        System.out.println("mdm2 param=" + m + 3/0);
        System.out.println("mdm2 param7777");
        return "mdm2:" + m;
    }



}
