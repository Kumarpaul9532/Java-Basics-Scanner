/* Programmer : Paul Kumar
   Date       : 14/05/2022
   Topic      : WAP in JAVA to find the sum of two numbers Entered by the user.  
                Display the output.
   IDE        : VS Code             */

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, sum;

        System.out.print("Enter two numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        sum = a + b;

        System.out.println("Sum = " + sum);
        sc.close();
    }
}
