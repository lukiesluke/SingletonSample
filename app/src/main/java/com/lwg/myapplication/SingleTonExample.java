package com.lwg.myapplication;

public class SingleTonExample {


    private static final SingleTonExample ourInstance = new SingleTonExample();
    private String editValue;

    private SingleTonExample() {

    }

    public static SingleTonExample getInstance() {
        return ourInstance;
    }

    public void setText(String editValue) {
        this.editValue = editValue;
    }

    public String getText() {
        return editValue;
    }
}
