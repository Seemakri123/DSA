public class checkPalindrome {

    static boolean isPalindrome(int n)
    {
        int num=n;
        int rev =0;
        while(n!=0)
        {
            int rem =n%10;
            rev = rev*10+rem;
            n=n/10;
        }
        return rev==num;
    }
    public static void main(String[] args) {
        int n =161;
        System.out.println(isPalindrome(n)?"Palindrome":"Not a Palindrome");
    }
}