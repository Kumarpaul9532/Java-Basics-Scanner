/* Programmer : Paul Kumar
   Date       : 14/05/2022
   Topic      : WAP in JAVA to Swap the two numbers without using third variable take  
                Input from the user.
   IDE        : VS Code             */

import java.util.Scanner;

public class Swapw {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Enter two number : ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("\nNumbers before swapping");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nNumbers after swapping");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
        sc.close();
    }
}
