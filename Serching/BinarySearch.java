package Serching;

import java.util.Scanner;

public class BinarySearch {
    static int SearchElement(int arr[],int target)
    {
        int s=0;
        int e=arr.length-1;
        while(s<=e)
        {
            int mid=(s+e)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]>target)
            {
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of Element");
        int n = sc.nextInt();
        System.out.println("Enter the element of Array");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target = sc.nextInt();

        int result= SearchElement(arr,target);
        if(result==-1)
        {
            System.out.println("Element is not present in the array");
        }
        else{
            System.out.println("Element foound at the index : "+result);
        }
    }
}
