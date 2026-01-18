public class countsDigit {
    static int countDigit(int n)
    {
        int count=0;
        while(n !=0)
        {
            count++;
            n/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        int n =2356;
        System.out.println(countDigit(n));
    }
}
