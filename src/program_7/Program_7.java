/*
 * created by Priyanka
 * Date:9/5/2019
 *This program is used to sort given number and display in non-increasing order.
 * and also calculate sum of even numbers.
 */
package program_7;

import java.util.*;

public class Program_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr;
        int sum=0;
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        arr=new int[size];
        System.out.println("Enter the input:");
        /* used to store array element given by user */
        for(int i=0;i<arr.length;i++) {
            int temp=sc.nextInt();
            arr[i]=temp;
        }
        /* This function is used to sort the numbers */
        Arrays.sort(arr);
        System.out.print("Sorted number in non-increasing order:");
        for(int i=arr.length-1;i>=0;i--) {
            System.out.print(arr[i]);
        }
        /* used calculate sum of even numbers present in that number */
        for(int i=0;i<arr.length;i++) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println(" ");
        System.out.println(" Sum of even numbers:"+sum);
        if(sum>15) {
            System.out.println("true");
        }
        else
            System.out.println("false");
    }
}
