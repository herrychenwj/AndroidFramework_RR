package com.queen.rxjavaretrofitdemo.entity;

/**
 * Created by chenwenjuan on 2017/1/13.
 */

public class NewsModel {
    private int museum_news_id;
    private String museum_name;
    private String title;
    private String picture;
    private String content;
    private String createdate;
    private Boolean read;

    public int getMuseum_news_id() {
        return museum_news_id;
    }

    public void setMuseum_news_id(int museum_news_id) {
        this.museum_news_id = museum_news_id;
    }

    public String getMuseum_name() {
        return museum_name;
    }

    public void setMuseum_name(String museum_name) {
        this.museum_name = museum_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public Boolean getRead() {
        return read;
    }

    public void setRead(Boolean read) {
        this.read = read;
    }
}
