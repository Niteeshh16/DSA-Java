public class CountDigits {
    static int count(int n){
        int counter =0;
        while (n > 0){
            n = n /10;
            counter++;
        }
        return counter;
    }
    public static void main(String[] args) {
       int n = 1204433434;
        System.out.println(count(n));
    }
}