/*
 * created by Priyanka
 * Date:9/5/2019
 *This program is used to print series 122333... and so on.
 */
package program_4;

import java.util.Scanner;

public class Program_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num;
        num=sc.nextInt();
        /* This is used to print value of each iteration */
        for(int i=1;i<=num;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(i);
            }
        }
    }
}
