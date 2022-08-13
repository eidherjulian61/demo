package com.example.demo.controller;

import com.example.demo.entities.Request;
import com.example.demo.entities.Response;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    @Autowired
    DemoService demoService;

    @GetMapping
    public ResponseEntity<Response> getPermutations(@RequestBody Request request) {
        return ResponseEntity.ok().body(demoService.findPermutations(request.getText(), request.getWord()));
    }
}
