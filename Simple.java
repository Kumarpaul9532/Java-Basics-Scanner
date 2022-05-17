/* Programmer : Paul Kumar
   Date       : 14/05/2022
   Topic      : WAP in JAVA to calculate the Simple Interest.Take necessary  
                Input from the user.
   IDE        : VS Code             */

import java.util.Scanner;

public class Simple {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int P, T;
        float R, SI;

        System.out.print("Enter Principal Amount : ");
        P = sc.nextInt();
        System.out.print("Enter Rate of Interest : ");
        R = sc.nextFloat();
        System.out.print("Enter Time : ");
        T = sc.nextInt();
        SI = (P * R * T) / 100f;

        System.out.println("Simple Interest = " + SI);
        sc.close();
    }

}
