package dev.ofiucoder.myarmstrongnumber.Controller;

public class ControllerArmstrong {


    public static void validaArmstrongNumber(int numb) {

        int copyOfNumb = numb;
        int noOfDigits = String.valueOf(numb).length();
        int sum = 0;

        while (copyOfNumb != 0) {
            int lastDigit = copyOfNumb % 10;
            int lastDigitToThePowerOfNumberOfDigits = 1;
            int i = 0;
            while (i < noOfDigits) {
                lastDigitToThePowerOfNumberOfDigits = lastDigitToThePowerOfNumberOfDigits * lastDigit;
                i = i + 1;
            }
            sum = sum + lastDigitToThePowerOfNumberOfDigits;
            copyOfNumb = copyOfNumb / 10;
        }

        if (sum == numb) {
            System.out.println( numb + " is an armstrong number");
        } else {
            System.out.println( numb + " is not an armstrong number");
        }


    }

}