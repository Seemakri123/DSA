package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoveZeroToTheEnd {
    public static void moveZeroAtEnd(int arr[])
    {
        List l = new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                l.add(arr[i]);
            }
        }

        int n=arr.length;
        for(int i=l.size();i<n;i++)
        {
            l.add(0);
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
        
        moveZeroAtEnd(arr);
    }
}
