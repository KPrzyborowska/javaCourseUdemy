package com.company;

public class SecondsAndMinutesChallenge {

    public static String getDurationString (int minutes, int seconds) {
        if (minutes <0 || (seconds <0 || seconds >59)) {
            System.out.println("Invalid value");
            return "Invalid value"; //return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes / 60;
        int remainingminutes = minutes % 60;

//        String hoursString = hours + "h";
//        if (hours <10){
//            hoursString = "0" + hoursString;                        dla dodanie 0 przed liczbami
//        }                                                             zamiast 1h 1m 34s to
//                                                                    01h 01m 34s
//        String minutesString = remainingminutes + "m";
//        if (remainingminutes <10){
//            minutesString = "0" + minutesString;
//        }
//
//        String secondsString = seconds + "s";
//        if (seconds <10){
//            secondsString = "0" + secondsString;
//        }
//        return hoursString + minutesString + secondsString;

        String result = hours + "h " + remainingminutes + "m " + seconds + "s";
        System.out.println(result);
        return result;
        }

        public static String getDurationString (int seconds) {
        if (seconds <0) {
            System.out.println("Invalid value");
            return "Invalid value"; //return INVALID_VALUE_MESSAGE;
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
            return SecondsAndMinutesChallenge.getDurationString(minutes, remainingSeconds);
        }

}

//komentarze - poprawiona, ulepszona wersja Tima