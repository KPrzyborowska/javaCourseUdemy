package com.company;

import java.util.Scanner;

public class MyScanner {

    Scanner scanner = new Scanner(System.in); // użyj klasy Scanner

    public void main() {
        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt(); //sprawdz czy podany jest int, jesli tak to cały warunek i obliczenia
        if(hasNextInt)

        {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line character (enter key)-żeby nie przeskakiwało do yourname, ale można było wpisać też name

            System.out.println("Enter your name: ");//wyprintuj polecenie
            String name = scanner.nextLine(); //zapisz odpowiedź
            int age = 2022 - yearOfBirth;

            if (age >= 0 && age <= 100) { //żeby age nie był na minusie, lub za wielką datą, nieprawdziwą
                System.out.println("Your name is " + name + ", and you are " + yearOfBirth + " years old."); // wyprintuj odpowiedź
            } else {
                System.out.println("Invalid year of birth");
            }
        } else{
            System.out.println("Unable to parse year of birth."); //sprawdz czy podany jest int - jeśli nei to wyprintuj te wiadomość
        }
        scanner.close(); //zakończ użycie Scannera
    }
}
