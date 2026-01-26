package Array;

import java.util.Scanner;

public class SecondLargestElementInAnArrayWithoutSorting {
    
    public static int secondLargestElement(int[] arr)
    {
        int max =0;
        int second=0;
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                second=max;
                max=arr[i];  
            }
            if(arr[i]>second && arr[i]!= max)
            {
                second=arr[i];
            }
        }
        return second;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        System.out.println("Enter the element of the array : ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println(secondLargestElement(arr));
    }
}
