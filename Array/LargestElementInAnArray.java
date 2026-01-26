package Array;

import java.util.Scanner;

public class LargestElementInAnArray {
    
    static public int LargestElementInAnArray(int arr[])
    {
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        System.out.println("Enter the element of the aaray : ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Largest element in the array is: ");
        System.out.println(LargestElementInAnArray(arr));
    }
}
