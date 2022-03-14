package com.company;

public class Main {

    public static void main(String[] args) {
	
        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;
        System.out.println("My Minimum Float Value = " + myMinFloat);
        System.out.println("My Maximum Float Value = " + myMaxFloat);

        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;
        System.out.println("My Minimum Double Value = " + myMinDouble);
        System.out.println("My Maximum Double Value = " + myMaxDouble);

        int myIntValue =5 / 2;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 5d / 2d;
        System.out.println ("My Int Value = " + myIntValue);
        System.out.println("My Float Value = " + myFloatValue);
        System.out.println("My Double Value = " + myDoubleValue);

        double pound = 5d;
        double kg = pound * 0.45359237d;
        System.out.println("kg converted from pounds = " + kg);
    }
}
