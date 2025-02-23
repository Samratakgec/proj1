package com.samrat.proj1.controller;

import org.springframework.stereotype.Controller;

@Controller
public class Pizza {
    public String getVegPizza()
    {
        return "Hot Veg Pizza is served" ;
    }
}
