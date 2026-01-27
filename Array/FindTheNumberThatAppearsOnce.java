package Array;

import java.util.Scanner;

public class FindTheNumberThatAppearsOnce {
    
    public static int findTheNumberThatAppearOnce(int arr[])
    {
        boolean b[] = new boolean[arr.length];
        int value=0;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(b[i]==false)
            {
             count=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    b[j]=true;
                }
            }

            if(count==1)
            {
                value=arr[i];
                break;
            }
        }
        }
        return value;
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

        System.out.println("Result : ");
        System.out.println(findTheNumberThatAppearOnce(arr));
    }
}
