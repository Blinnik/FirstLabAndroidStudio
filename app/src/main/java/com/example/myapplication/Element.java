package com.example.myapplication;

public class Element {
    private int img;
    private String descr;
    public Element(int img, String descr){
        this.img=img;
        this.descr=descr;
    }
    public int getImg(){
        return this.img;
    }
    public String getDescr(){
        return this.descr;
    }
}
