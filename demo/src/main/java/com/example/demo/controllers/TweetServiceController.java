package com.example.demo.controllers;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.example.demo.model.Tweet;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TweetServiceController {

    private static Map<Integer, Tweet> tweets = new HashMap<>();

    static {

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

        tweets.put(tweet1.getNumber(), tweet1);
        tweets.put(tweet2.getNumber(), tweet2);

    }

    /**
     * Iniciando CRUD de tweet
     */

    /**
     * 
     * @return lista de tweets
     */
    @RequestMapping(value = "/tweets")
    public Collection<Tweet> getTweets() {
        return tweets.values();
    }

    /**
     * 
     * @param tweet
     * @return mesangem de sucesso para criação de tweet
     */

    @RequestMapping(value = "/tweets", method = RequestMethod.POST)
    public String createTweet(@RequestBody Tweet tweet) {
        tweets.put(tweet.getNumber(), tweet);
        return "Tweet criado com sucesso";
    }
    /**
     * 
     * @param index índice do array representando a posição do tweet
     * @param tweet informações passadas no corpo da req para update
     * @return lisat de tweets após o update
     */
    @RequestMapping(value = "/tweets/{id}", method = RequestMethod.PUT)
    public String updateTweet(@PathVariable("id") int id, @RequestBody Tweet tweet) {
        tweets.remove(tweet.getNumber());
        tweet.setNumber(id);
        tweets.put(tweet.getNumber(), tweet);
        return "Tweet alterado com sucesso";
    }
    /**
     * 
     * @param id // índice do array representa a posição do tweet
     * @return // lista de tweets apos a remoção
     */

    @RequestMapping(value = "/tweets/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") int id) { 
      tweets.remove(id);
      return "Tweet removido com sucesso";
   }
   /**
    * 
    * @param number índice do tweet no array
    * @return tweet selecionado
    */

   @RequestMapping(value= "/tweets/{number}", method = RequestMethod.GET)
   public Tweet getTweet(@PathVariable("number") int number){
       return tweets.get(number);
   }

}