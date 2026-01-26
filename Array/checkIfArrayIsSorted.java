package Array;

import java.util.Scanner;

public class checkIfArrayIsSorted {
    
    public static int checkIfArrayIsSortedOrNotInAsc(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)

            {
                if(arr[i]>arr[j])
                {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static int checkIfArrayIsSortedOrNotInDesc(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    return 0;
                }
            }
        }
        return 1;
    }
    public static boolean checkIfArrayIsSortedOrNot(int arr[])
    {
        if(checkIfArrayIsSortedOrNotInAsc(arr)==1 || checkIfArrayIsSortedOrNotInDesc(arr)==1)
        {
           return true;
        }
        return false;
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

        System.out.println(checkIfArrayIsSortedOrNot(arr)?"Sorted":"Not Sorted");
    }
}
