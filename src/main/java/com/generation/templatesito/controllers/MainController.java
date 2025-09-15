package com.generation.templatesito.controllers;

import com.generation.templatesito.model.entities.Book;
import com.generation.templatesito.model.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController
{
    @Autowired
    BookRepository repo;

    @GetMapping("")//localhost:8080
    public String homepage()
    {
        return "home";
    }

    @GetMapping("form")//localhost:8080
    public String formBook()
    {
        return "formBook";
    }

    @GetMapping("all")//localhost:8080
    public String allBooks(Model m)
    {
        m.addAttribute("books",repo.findAll());
        return "allBooks";
    }

    @GetMapping("save")//localhost:8080
    public String save
            (
                  @RequestParam String au,
                  @RequestParam String ti,
                  @RequestParam int ye
            )
    {

        Book b = new Book();
        b.setAuthor(au);
        b.setTitle(ti);
        b.setYear(ye);
        repo.save(b);
        //riga 51 uguale a <a href="/all"> ma su codice
        return "redirect:/all";//manda al server una request con uri /all
    }

}
