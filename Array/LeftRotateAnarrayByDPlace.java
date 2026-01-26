package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeftRotateAnarrayByDPlace {
    
    public static void LeftRotateArrayByDPlace(int arr[],int d)
    {
        List l = new ArrayList<>();
        for(int i=d;i<arr.length;i++)
        {
            l.add(arr[i]);
        }
        for(int i=0;i<d;i++)
        {
            l.add(arr[i]);
        }

        for(Object ele:l)
        {
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Element in the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        } 
        System.out.println("Enter the positon");
        int d = sc.nextInt();
        
        LeftRotateArrayByDPlace(arr,d);
    }
}
