package com.example.demo.controlers;

import java.util.ArrayList;

import com.example.demo.Services.RickAndMortyService;
import com.example.demo.models.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @Autowired
    RickAndMortyService rickAndMortyService;
    
    @RequestMapping("rickandmorty/listview")
    public String getRickAndMortyListView(Model model) {
        ArrayList<Person> persons = rickAndMortyService.getCharactersFromAPI();
        model.addAttribute("persons", persons);
        return "rickandmorty";
    }
}