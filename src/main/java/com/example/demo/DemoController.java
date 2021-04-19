package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(path="/")    
    @CrossOrigin()
    String start(){
        return "Version 1";
    }



    @GetMapping(path="/player")    
    @CrossOrigin()
    List<String> getAll(){
        var l = new ArrayList<String>();
        l.add("Test");
        l.add("Test2");
        return l;
    }
    
}
