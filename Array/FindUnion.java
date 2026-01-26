package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindUnion {
    
    public static void FindUnionOfArray(int arr1[],int arr2[])
    {
        List l = new ArrayList<>();

        int i=0;
        int j=0;
        int n=arr1.length;
        int m=arr2.length;
        while(i<n && j<m)
        {
            if(arr1[i]<arr2[j])
            {
                l.add(arr1[i]);
                i++;
            }

            else if(arr1[i]>arr2[j])
            {
                l.add(arr2[j]);
                j++;
            }
            else if(arr1[i]==arr2[j])
            {
                l.add(arr1[i]);
                i++;
                j++;
            }

        }
        while(i<n)
        {
            l.add(arr1[i]);
            i++;
        }
         while(j<m)
        {
            l.add(arr2[j]);
            j++;
        }

        for(Object ele:l)
        {
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array");
        int size=sc.nextInt();
        System.out.println("Enter the element of the first array : ");
        int arr1[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the size of the second array");
         int length=sc.nextInt();
        System.out.println("Enter the element of the second array : ");
        int arr2[] = new int[length];
        for(int i=0;i<length;i++)
        {
            arr2[i]=sc.nextInt();
        }
        
        FindUnionOfArray(arr1,arr2);
    }
}
