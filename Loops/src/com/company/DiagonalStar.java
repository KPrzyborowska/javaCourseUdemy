package com.company;

public class DiagonalStar {

    public static void printSquareStar (int number) {
        if (number <5) {
            System.out.println("Invalid Value");
            return;
        }
        for (int rowIndex = 0; rowIndex < number; rowIndex++) {
            String row = "";
            for (int columnIndex = 0; columnIndex < number; columnIndex++) {
                if(rowIndex == 0 || rowIndex == number -1){
                    row += "*";
                } else if (columnIndex == 0 || columnIndex == number - 1) {
                    row += "*";
                }else if(rowIndex == columnIndex){
                    row += "*";
                }else if (columnIndex == number - (rowIndex +1)){
                    row += "*";
                }else {
                    row += " ";
                }
            }
            System.out.println(row);
        }
    }
}
