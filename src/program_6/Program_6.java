/*
 * created by Priyanka
 * Date:9/5/2019
 *This program is used to find out given single characteris is small letter,capital letter,digit or special symbol.
 */
package program_6;
import java.util.Scanner;
public class Program_6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input;
        System.out.println("Enter input:");
        input=sc.nextLine();
        if(input.length()>1) {
            System.out.println("Enter only single character");
        }
        else {
            for(int j=0;j<input.length();j++) {
                int temp = input.charAt(j);
                /* compares character with their ASCII value */
                if(temp >= 97 && temp <= 123) {
                    System.out.println("small case letter");
                }
                else if(temp >= 65 && temp <= 90) {
                    System.out.println("upper case letter");
                }
                else if(temp >= 48 && temp <= 57) {
                    System.out.println("digit");
                }
                else
                    System.out.println("special symbol");
            }
        }
    }
}
