package com.marci.mentoring;

//class - tervrajz
//object - tervrajz alapján készített objektum
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int age = 34;
        Number ageOfMarci = new Number(34, "marci");
        Number ageOfZoli = new Number(19, "zoli");

        System.out.println(ageOfMarci);
        System.out.println(ageOfMarci.getNumber());
        ageOfMarci.add(5);
        System.out.println(ageOfMarci.getNumber());
        System.out.println(ageOfZoli.getNumber());

        System.out.println("Is Marci at his prime: " + ageOfMarci.isPrime());
        System.out.println("Is Zoli at his prime: " + ageOfZoli.isPrime());
    }
}
