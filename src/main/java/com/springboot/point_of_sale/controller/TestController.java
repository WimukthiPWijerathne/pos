package com.springboot.point_of_sale.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api/v1/test")
public class TestController {


    @GetMapping(path="/get-text-1 " )
     public void getMyText(){
         String myText = "This is my first springboot";
         System.out.println(myText);
     }
}
