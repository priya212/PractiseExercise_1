/*
 * created by Priyanka
 * Date:9/5/2019
 *This program is used to print given string in reverse order.
 */
package program_9;

import java.util.Scanner;

public class Program_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input,reverse_string="";
        int length;
        System.out.println("Enter the input:");
        input=sc.nextLine();
        length=input.length();
        /* used to reverse the given string */
        for(int i=length-1 ; i >= 0 ; i--)
        {
            reverse_string=reverse_string+input.charAt(i);
        }
        System.out.println("output:"+reverse_string);
    }
}
