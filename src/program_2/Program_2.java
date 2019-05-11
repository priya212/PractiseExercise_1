/*
 * created by Priyanka
 * Date:9/5/2019
 *This program is used to if number is even then display jerry else display tom.
 * But number should between 20 to 30.
 */
package program_2;

import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the number:");
        num=sc.nextInt();
        /* This if statement is used to find out given number is in betwwen 20 to 30 or not*/
        if(num>=20 && num<=30) {
            /* This condition is used to find out given number is even or not */
         if(num%2==0) {
            System.out.println("Jerry");
         }
         else {
            System.out.println("Tom");
         }
        }
        else {
            System.out.println("Number is not between 20 to 30");
        }
    }
}
