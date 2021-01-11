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
        System.out.println("mdm1 param=" + m);
        return "mdm1:" + m;
    }


}
