public class checkForPrime {
    static boolean isPrime(int n)
    {
        if(n==1 || n==0)
        {
            return false;
        }
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(isPrime(n)?"Prime":"Not");

    }
}
