package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyDay1App 
{
@GetMapping("disp")
    public String Display()
     {
        		return "/welcome";
                	}

                    }
                
                   