package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import com.example.model.Tweet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TweetServiceController{

    private static List<Tweet> tweets = new ArrayList<>();

    static{

        Tweet tweet1 = new Tweet();
        tweet1.setNumber(01);
        tweet1.setName("Primeiro Tweet");
        tweet1.setTitle("Tweet1");
        tweet1.setDescription("Descrição Tweet1");
        tweet1.setAtivo(true);
        tweet1.setUrl("www.tweet1.com.br");
        tweet1.setPefurl("pefurl");

        Tweet tweet2 = new Tweet();
        tweet2.setNumber(02);
        tweet2.setName("Segundo Tweet");
        tweet2.setTitle("Tweet2");
        tweet2.setDescription("Descrição Tweet2");
        tweet2.setAtivo(true);
        tweet2.setUrl("www.tweet2.com.br");
        tweet2.setPefurl("pefurl");

        tweets.add(tweet1);
        tweets.add(tweet2);

    }

    /**
     * Iniciando CRUD de tweet
     */


    /**
     * 
     * @return lista de tweets
     */
    @RequestMapping(value = "/tweets")
    public List<Tweet> getTweets() {
        return tweets;
    }
    



}