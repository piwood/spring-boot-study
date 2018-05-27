/**
 * 
 */
package com.sharkman.themeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TestController
 * @author piwood
 * @date 2018年5月27日
 */
@Controller
public class TestController {
    /**
     * 跳转到index
     * @return
     */
    @RequestMapping("/")
    public String toIndex(Model model) {
        model.addAttribute("name", "刘婷婷");
        model.addAttribute("thing", "如此之可爱");
        return "index";
    }
}
