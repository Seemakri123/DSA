package Serching;

import java.util.Scanner;

public class BinarySearchWithRecursion {
    
    static int Search(int arr[],int target,int start,int end)
    {
        int mid = (start+end)/2;
        if(start>end)
        {
            return -1;
        }
        if(arr[mid]==target)
        {
            return mid;
        }
        else if(arr[mid]>target)
        {
            return Search(arr,target,start,mid-1);
        }

        return Search(arr, target, mid+1, end);
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of element");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Element of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        int start=0;
        int end=arr.length-1;
        int result =Search(arr,target,start,end);
        if(result==-1)
        {
            System.out.println("Element is not found ");
        }
        else{
            System.out.println("Element is found at the index : "+result);
        }
    }
}
