package com.marci.mentoring;
public class App {
    public static void main(String[] args) {
        int age = 34;
        String name = "marci";
        Number ageOfMarci = new Number(age, name);

        Number ageOfZoli = new Number(19, "zoli");

        System.out.println(ageOfMarci);
        System.out.println(ageOfMarci.getNumber());
        ageOfMarci.add(5);
        System.out.println(ageOfMarci.getNumber());

        //asdasdasd

        System.out.println("Is Marci at his prime: " + ageOfMarci.isPrime());
        System.out.println("Is Zoli at his prime: " + ageOfZoli.isPrime());
        Tutorial tutorial = new Tutorial("asd");
        tutorial.calculate(3, true,"asd");
    }
}
