/*
 * created by Priyanka
 * Date:9/5/2019
 *This program is used to take string and number of last character to be repeated.
 */
package program_10;

import java.util.Scanner;

public class Program_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input1;
        int input2;
        System.out.println("Enter the input1:");
        input1=sc.nextLine();
        System.out.println("Enter the input2:");
        input2=sc.nextInt();
        int len= input1.length();
        int len1=len-input2;
        char[] c1=input1.toCharArray();
        System.out.println(input1.subSequence(len1,len));
        System.out.print(input1);
        for(int i=0 ; i < input2 ; i++)
        {
            System.out.print(input1.subSequence(len1,len));
        }
    }
}
