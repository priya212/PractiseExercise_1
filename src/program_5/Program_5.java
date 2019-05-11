/*
 * created by Priyanka
 * Date:9/5/2019
 *This program is used to calculate sum of all given number.
 */
package program_5;

import java.util.Scanner;

public class Program_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size,length,sum=0;
        System.out.println("Enter size:");
        size=sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter input:");
        /* This condition is used to calculate sum of all numbers present inside array */
        for(int i=0 ; i < size ; i++) {
            int temp=sc.nextInt();
            arr[i]=temp;
            sum=sum+arr[i];
        }
        System.out.println("output:"+sum);
    }
}
