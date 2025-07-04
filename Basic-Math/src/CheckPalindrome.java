public class CheckPalindrome {
    static boolean check(int n){
      //  boolean palindrome = false;
        int number = n;
        int rev = 0;
        while (n != 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n/10;

        }

        if(rev==number ) return true;
        else
            return false;

    }
    public static void main(String[] args) {
        int n = 1001001;
        System.out.println(check(n));
    }
}
