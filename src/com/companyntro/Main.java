package com.companyntro;

public class Main {

    public static void main(String[] args) {

        // Assignment
        // Create a class that models a person
        // features of the person class: height, gender, complexion, age
        // actions: walking, talking, eat, and run.


        Human hulk = new Human();


        // Person No 1
        hulk.height = 3;
        hulk.gender = "Male";
        hulk.complexion = "Green";
        hulk.age = 35;


        System.out.println("Hulk is a MARVEL superhero who is " + hulk.height + " meters high!");
        System.out.println("Hulk is a " + hulk.age + " years old " + hulk.gender +
                " . Hulk's complexion is " + hulk.complexion);


        System.out.println("No natter is it weekend or working day: ");
        hulk.walk();
        hulk.talk();
        hulk.eat();
        hulk.run();
        System.out.println("What an active hero!");


        // Person No 2
        Human loki = new Human();
        loki.height = 1.85;
        loki.gender = "Female";
        loki.complexion = "Pale white";
        loki.age = 100000;


        System.out.println("Loki is a MARVEL superhero who is " + loki.height + " meters high!");
        System.out.println("Loki is a " + loki.age + " years old " + loki.gender +
                " . Loki's complexion is " + loki.complexion);

        System.out.println("Every day Loki: ");
        loki.walk();
        loki.talk();
        loki.talk();
        loki.talk();
        loki.talk();
        System.out.println("What a talkative Scandinavian god!");



    }
}
