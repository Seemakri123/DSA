package Serching;

import java.util.Scanner;

public class LinearSearch {

    static int isFound(int arr[],int target)
    {
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of element in the array");
        int n = sc.nextInt();
        System.out.println("Enter the element of the array");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target = sc.nextInt();

        int result=isFound(arr,target);
        if(result==-1)
        {
            System.out.println("Value is not found");
        }
        else
        {
            System.out.println("Value is found at index : "+result);
        }
    }
}
