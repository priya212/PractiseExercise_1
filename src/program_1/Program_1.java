/*
 * created by Priyanka
 * Date:9/5/2019
 *This program is used to find out given number is palindrome or not.
 * If number is palindrome then show sum of even numbers is greater than 24 or not.
 */
package program_1;

import java.util.Scanner;

public class Program_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, temp, rem, total = 0,sum=0,sum1=0;;
        System.out.print("Enter the number:");
        num=sc.nextInt();
        temp=num;
        /* this loop is used to reverse the original number */
        while(num != 0) {
            rem=num % 10;
            total=(total * 10)+rem;
            num=num/10;
        }
        /* used to compare original string and reverse string is equal or not */
        if(temp == total) {
            System.out.print(total+" is palindrome");
            while(total > 0) {
                rem = total % 10;
                if (rem % 2 == 0) {
                    sum1 = sum1 + rem;
                }
                total = total / 10;
            }
            if(sum1>25) {
                System.out.println(" and sum of even number is greater than 25");
            }
            else {
                System.out.println(" and sum of even number is less than 25");
            }
        }
        else {
            System.out.println("number is  not palondrome");
        }
    }
}
