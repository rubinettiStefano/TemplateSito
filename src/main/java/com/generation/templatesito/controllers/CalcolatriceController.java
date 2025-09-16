package com.generation.templatesito.controllers;

import com.generation.templatesito.model.dtos.CalcolatriceDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalcolatriceController
{
    @GetMapping("calcolatrice")
    public String apriCalcolatrice()
    {
        return "calcolatrice";
    }

    @PostMapping("calcolatrice")
    public String calcola
            (
                    @ModelAttribute CalcolatriceDto dto,
                    Model m
            )
    {
        double res;
        switch (dto.getOperation())
        {
            case "+"->res=dto.getNum1()+ dto.getNum2();
            case "-"->res=dto.getNum1()- dto.getNum2();
            case "*"->res=dto.getNum1()* dto.getNum2();
            default ->res=dto.getNum1()/ dto.getNum2();
        }
        m.addAttribute("res",res);
        m.addAttribute("dto",dto);
        return "calcolatrice";
    }
}
