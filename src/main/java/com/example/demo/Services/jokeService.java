package com.example.demo.Services;

import java.util.ArrayList;

import com.example.demo.models.Joke;
import com.example.demo.repositories.jokeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class jokeService {
    @Autowired
    jokeRepository jokeRepository;

    public Joke saveJoke(Joke joke) {
        // insert into joke(text) values('text')
        return jokeRepository.save(joke);
    }

    public ArrayList<Joke> getAllJoke() {

        //select * from joke
        ArrayList<Joke> jokes = (ArrayList<Joke>) jokeRepository.findAll();
        return jokes;
    }
}
