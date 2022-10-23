package com.example.springbootapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/news")
public class NewsController {
    @GetMapping("/headline")
	@ResponseBody
	public String getLatestBusinessNewsHeadline() {
      return "How Fast Is A ChargePoint Home Flex Charger?";
    
    }
}
