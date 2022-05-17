/* Programmer : Paul Kumar
   Date       : 14/05/2022
   Topic      : WAP in Java to accept temperature in Fahrenheit
                and convert it into Celsuis.
   IDE        : VS Code             */

import java.util.Scanner;

public class Fahtocel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float fah, cel;

        System.out.printf("Enter temperature in Fahrenheit ");
        fah = sc.nextFloat();
        cel = (fah - 32) / 1.8f;

        System.out.println("Temperature in Celsius is " + cel);
        sc.close();
    }

}
