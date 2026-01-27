package Array;

import java.util.Scanner;

public class maximumConsecutiveOne{

    
    public static int countMaximumOne(int arr[])
    {
        int count=0;
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                count++;
                
            }
            else if(arr[i]!=1)
            {
                if(max<count)
                {
                    max=count;
                }
                count=0;
            }
        }
        return max;
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

        System.out.println(countMaximumOne(arr));
    }
}