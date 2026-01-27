// package Array;

// import java.util.Scanner;

// public class FindMissingNumberInAnArray {
    
//     public static int findMissingNumber(int arr[])
//     {
//         int min;
//         int max=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             min=arr[0];
//             if(arr[i]<min)
//             {
//                 min=arr[i];
//             }
//             if(arr[i]>max)
//             {
//                 max=arr[i];
//             }
//         }



//         for(int i=min;i<max;i++)
//         {

//         }

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of the array");
//         int size=sc.nextInt();
//         System.out.println("Enter the element of the array : ");
//         int arr[] = new int[size];
//         for(int i=0;i<size;i++)
//         {
//             arr[i]=sc.nextInt();
//         }

//         findMissingNumber(arr);
//     }
// }
