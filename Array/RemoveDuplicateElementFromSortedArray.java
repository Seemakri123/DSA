package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicateElementFromSortedArray {
    public static void removeDuplicateElement(int arr[])
    {
        List l = new ArrayList<>();
        l.add(arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]!=arr[i])
            {
                l.add(arr[i]);
            }
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

        removeDuplicateElement(arr);
    }
}
