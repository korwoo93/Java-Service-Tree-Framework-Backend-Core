package com.arms.korwoo;

public class Tv {
    String colour;
    boolean power;
    int channel;

    void power(){
        power=!power;
    }
    void channelUp(){
        ++channel;
    }
    void channelDown(){
        --channel;
    }
}
