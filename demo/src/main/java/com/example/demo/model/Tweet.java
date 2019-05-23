package com.example.demo.model;

public class Tweet{

    private int number;
    private String name;
    private String title;
    private String description;
    private boolean ativo;
    private String url;
    private String pefurl;

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @return the pefurl
     */
    public String getPefurl() {
        return pefurl;
    }
    /**
     * @return the status
     */

    public boolean getAtivo(){
        return ativo;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @param pefurl the pefurl to set
     */
    public void setPefurl(String pefurl) {
        this.pefurl = pefurl;
    }
}
