package com.companyntro;

public class Human {

    double height;
    String gender;
    String complexion;
    int age;


    void walk () {
        if (gender == "Male") {
            System.out.println("He walks.");
        } else {
            System.out.println("She walks.");
        }
    }

    void talk () {
        if (gender == "Male") {
            System.out.println("He talks.");
        } else {
            System.out.println("She talks.");
        }
    }

    void eat () {
        if (gender == "Male") {
            System.out.println("He eats.");
        } else {
            System.out.println("She eats.");
        }
    }

    void run () {
        if (gender == "Male") {
            System.out.println("He runs.");
        } else {
            System.out.println("She runs.");
        }
    }

    boolean isOlder (double otherAge) {
        if (otherAge < age) {
            return true;
        } else {
            return false;
        }

    }

}

