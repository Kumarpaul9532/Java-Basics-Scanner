/* Programmer : Paul Kumar
   Date       : 14/05/2022
   Topic      : WAP in JAVA to calculate the Compound Interest.Take necessary  
                Input from the user.
   IDE        : VS Code             */

import java.util.Scanner;

public class Compound {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int P, T;
        double R, CI;

        System.out.print("Enter Principal Amount : ");
        P = sc.nextInt();
        System.out.print("Enter Rate of Interest : ");
        R = sc.nextDouble();
        System.out.print("Enter Time in years : ");
        T = sc.nextInt();
        CI = P * Math.pow(1 + (R / 100), T) - P;

        System.out.println("Compound Interest = " + CI);
        sc.close();
    }

}
