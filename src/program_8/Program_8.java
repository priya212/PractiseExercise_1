/*
 * created by Priyanka
 * Date:9/5/2019
 *This program is used to guess correct number.
 */

package program_8;

import java.util.Scanner;

public class Program_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int gussedNumber, originalNumber;
        gussedNumber = sc.nextInt();
        originalNumber = 35;
        do {
            if ((gussedNumber > 1) && (gussedNumber <= 50)) {
                if (originalNumber > gussedNumber) {
                    System.out.println("Number guessed is less than original number");
                } else if (originalNumber < gussedNumber) {
                    System.out.println("Number guessed is more than original number");
                }
            } else {
                System.out.println("Enter number between range 1-50");
            }
            System.out.println("Enter again");
            gussedNumber=sc.nextInt();
        }while( gussedNumber != originalNumber );
        System.out.println("Number guessed matches the original number");
    }
}
