package com.cleverlance.academy.aggregator.controller;

import com.cleverlance.academy.aggregator.model.Address;
import com.cleverlance.academy.aggregator.model.Identification;
import com.cleverlance.academy.aggregator.sevice.IdentificationService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {

    private final IdentificationService identificationService;

    public WebController(IdentificationService identificationService) {
        this.identificationService = identificationService;
    }

    @GetMapping("/web/home")
    public ModelAndView home() {
        ModelAndView model = new ModelAndView("home");
        model.addObject("identification", new Identification());
        return model;
    }
    
    @PostMapping("/web/add")
    public String save(@Valid Identification identification, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "home";
        }
        
        this.identificationService.saveIdentification(identification);
        return "redirect:/web/home";
    }
    
    @GetMapping("/web/list")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("list");

        modelAndView.addObject("items", this.identificationService.getIdentification(10, 0));
        
        return modelAndView;
    }
}
