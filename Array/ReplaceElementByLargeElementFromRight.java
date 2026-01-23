package Array;

import java.util.Scanner;

public class ReplaceElementByLargeElementFromRight {
    
    static void replaceElementByLarger(int arr[])
    {
        int max=arr[arr.length-1];
        for(int i=arr.length-1;i>=0;i--)
        {
            if(max<=arr[i])
            {
                max=arr[i];
                arr[i]=-1;
            }
            else{
                arr[i]=max;
            }
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

        replaceElementByLarger(arr);
        for(int ele :arr)
        {
            System.out.print(ele+" ");
        }
    }
}
