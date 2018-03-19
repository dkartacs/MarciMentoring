package com.marci.mentoring;

import com.marci.mentoring.util.Math;

public class Number {

    private int number;
    private String name;

    public Number (int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public void add(int number){
        this.number = this.number + number;
    }

    public void substract(int number){
        this.number -= this.number + number;
    }

    public boolean isPrime() {
        return Math.isPrime(this.number);
    }
}
