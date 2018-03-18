package com.marci.mentoring;

//public = bárki használhatja ezt az osztályt
//class = tervrajz
public class Number {

    // private = csak ezen a classon belül elérhető
    // int = egész szám negativ 2,4 milliárd-tól plusz 2,4 milliárdig
    // number = változónév bármi lehet

    //short
    //int
    //long
    //

    //double

    //char "a" "A76" -> "a"

    //String "akármilyen string"

    //boolean lehet true vagy false

    private int number;
    private String name;

    //construktor
    public Number (int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return this.number;
    }

    public void add(int number){
        this.number = this.number + number;
    }

    public void substract(int number){
        this.number -= this.number + number;
    }

    //boolean - két értéke lehet true vagy false
    public boolean isPrime() {
        return Math.isPrime(this.number);
    }
}
