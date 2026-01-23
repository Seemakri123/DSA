import java.util.Scanner;

public class SelectionSort {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<=n-2;i++)
        {
            int mim=i;
            for(int j=i;j<=n-1;j++)
            {
                if(arr[j]<arr[mim])
                {
                    mim=j;
                }
                int temp=arr[mim];
                arr[mim]=arr[i];
                arr[i]=temp;
            }
        }
System.out.println("Output--------------------------------------");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
