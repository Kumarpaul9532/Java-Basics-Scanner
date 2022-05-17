/* Programmer : Paul Kumar
   Date       : 14/05/2022
   Topic      : WAP in Java to accept temperature in Celsius
                and convert it into Fahrenheit.
   IDE        : VS Code             */

import java.util.Scanner;

public class Celtofah {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float fah, cel;

        System.out.printf("Enter temperature in Celsius : ");
        cel = sc.nextFloat();
        fah = (cel * 1.8f) + 32;

        System.out.println("Temperature in Fahrenheit is " + fah);
        sc.close();
    }

}