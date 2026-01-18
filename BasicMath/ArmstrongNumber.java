public class ArmstrongNumber {
    static int countOfDigit(int n)
    {
        int count =0;
        while(n!=0)
        {
            count++;
            n/=10;
        }
        return count;
    }
    static int power(int rem,int n)
    {
        int pow=1;
        for(int i=1;i<=n;i++)
        {
            pow=pow*rem;
        }
        return pow;
    }
    static boolean isArmstrong(int n)
    {
        int num=n;
        int temp=0;
        while(n!=0)
        {
            int rem =n%10;
            temp=temp+power(rem,countOfDigit(num));
            n/=10;
        }
        return num==temp;
    }
    public static void main(String[] args) {
        int n =123;
        System.out.println(isArmstrong(n)?"Armstrong":"Not");
    }
}
