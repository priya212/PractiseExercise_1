/*
 * created by Priyanka
 * Date:9/5/2019
 *This program is used to find out give character is vowel or consonant.
 */
package program_3;

import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input;
        System.out.println("Enter input:");
        input=sc.nextLine();
        for(int j=0;j<input.length();j++)
        {
            int temp=input.charAt(j);
            /* This condition is used to compare given input with their ASCII value */
            if((temp >= 65 && temp <= 90) || (temp >= 97 && temp <= 122) )
            {
                if(temp=='a' || temp=='e' || temp=='i' || temp=='o' || temp=='u' || temp=='A' || temp=='E' || temp=='I' || temp=='O' || temp=='U')
                {
                    System.out.print(" vowel");
                }
                else
                {
                    System.out.print(" Consonant");
                }
            }
            else {
                System.out.println(" not a character");
                break;
            }
        }
    }
}
