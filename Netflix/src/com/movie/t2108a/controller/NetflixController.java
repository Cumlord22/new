package com.movie.t2108a.controller;

import com.movie.t2108a.model.Netflix;

import java.util.ArrayList;
import java.util.List;

public class NetflixController {
    NetflixController netflixController = new NetflixController();
    public void searchByName(List<Netflix> list, String name){
        for(int i = 0; i< list.size(); i++){
            list.get(i).getTitle().contains(name);
        }
    }
    public void searchByCategory(List<Netflix> list, String category){}
    public void searchByLanguage(List<Netflix> list, String language){}
    public void getAllMovieCategory(List<Netflix> list){
    }
}