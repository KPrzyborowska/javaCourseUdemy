package com.company;

public class Main {

    public static void main(String[] args) {
	String myString = "This is a String";
        System.out.println("My string is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("My string is equal to " + myString);
        myString = myString + " \u00A9 2022";
        System.out.println("My string is equal to " + myString);

        String numberString = "250.45";
        numberString = numberString + " 49.56";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last String is equal to " + lastString);

        double doubleNumber = 120.45d;
        lastString = lastString + doubleNumber;
        System.out.println("Last String is equal to " + lastString);
    }
}
