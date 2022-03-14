public class TeenNumberChecker {

    public static boolean hasTeen (int number1, int number2, int number3) {
        if ((number1 >= 13 && number1 <= 19) || (number2 >=13 && number2 <= 19)
            || (number3 >= 13 && number3 <=19)) {
            return true;
//            boolean teen =
//            System.out.println("Number is teen " + );
        } else {
            return false;
        }
    }

    public static boolean isTeen (int number4) {
        if (number4 >= 13 && number4 <= 19) {
            return true;
        } else {
            return false;
        }
    }
}
