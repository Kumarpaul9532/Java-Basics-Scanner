/* Programmer : Paul Kumar
   Date       : 14/05/2022
   Topic      : WAP in JAVA to calculate the average of three subjects/numbers,
                Entered by the user.
   IDE        : VS Code             */

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, c;
        float avg;

        System.out.print("Enter three numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        avg = (a + b + c) / 3.0f;

        System.out.println("The average is " + avg);
        sc.close();
    }
}
