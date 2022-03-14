package com.company;

public class FlourPacker {

    public static boolean canPack (int bigCount, int smallCount, int goal) {

        bigCount = bigCount * 5;
        smallCount = smallCount * 1;

        if ((bigCount <0) || (smallCount <0) || (goal <0)) {
            return false;
        }

        if (goal == bigCount + smallCount) {
            return true;
        } else if (bigCount + smallCount < goal) {
            return false;
        } else if (bigCount + smallCount > goal) {
            
        }
    }
}
