/* Programmer : Paul Kumar
   Date       : 14/05/2022
   Topic      : WAP in JAVA to accept radius of circle from the user
                and calculate the Area of circle .
   IDE        : VS Code             */

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float r, area;

        System.out.print("Enter radius of circle : ");
        r = sc.nextFloat();
        area = 3.14f * r * r;

        System.out.println("Area of circle is " + area);
        sc.close();
    }

}