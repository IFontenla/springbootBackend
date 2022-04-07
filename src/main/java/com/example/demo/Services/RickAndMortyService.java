package com.example.demo.Services;

import java.util.ArrayList;

import com.example.demo.models.Person;
import com.example.demo.models.Persons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RickAndMortyService {

    @Autowired
    RestTemplate restTemplate;

    public Person getCharacterFromAPI(){
        long numeroRandom = Math.round(Math.random()*827);
        String url = "https://rickandmortyapi.com/api/character/" + numeroRandom;
        Person character = restTemplate.getForObject(url, Person.class);
        return character;
    }

    public ArrayList<Person> getCharactersFromAPI() {
        String url = "https://rickandmortyapi.com/api/character/";
        Persons persons = restTemplate.getForObject(url,Persons.class);
        return persons.results;
    }
}
    

