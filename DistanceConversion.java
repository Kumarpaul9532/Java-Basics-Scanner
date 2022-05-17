/* Programmer : Paul Kumar
   Date       : 14/05/2022
   Topic      : WAP in JAVA to accept distance in kilometer and 
                convert it into meter and centimeter .
   IDE        : VS Code             */

import java.util.Scanner;

public class DistanceConversion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int km;

        System.out.print("Enter the distance in kilometer : ");
        km = sc.nextInt();

        System.out.println("Distance in meter is " + km * 1000);
        System.out.println("Distance in centimeter is " + km * 1000 * 100);
        sc.close();

    }
}
