class Demo{
     static int n =0;
    static void printName(){

        if (n < 5){
            System.out.println("hello name is niteesh");
            n++;
            printName();

        }
    }


    public static void main(String[] args) {
        printName();
    }

}