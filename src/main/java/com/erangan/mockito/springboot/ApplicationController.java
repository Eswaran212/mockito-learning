package com.erangan.mockito.springboot;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.http.HttpStatus.OK;

@Controller
public class ApplicationController {
    @RequestMapping(path = "/health")
    public ResponseEntity healthCheck(){
        return  new ResponseEntity("API is Healthy",OK);
    }
}
