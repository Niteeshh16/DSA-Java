public class GcdAndLcm {
    static int findGCD(int a, int b){
        while (b!=0){
            int temp = b;
            b= a %b;
            a = temp;
        }
        return a;
    }

    static int findLCM(int a, int b){
        return (a*b)/findGCD(a,b);
    }
    public static void main(String[] args) {
            int a=23,b=25;
        System.out.println(findGCD(a,b));
        System.out.println(findLCM(a,b));
    }
}
