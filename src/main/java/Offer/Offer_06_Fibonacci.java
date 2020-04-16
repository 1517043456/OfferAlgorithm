package Offer;

public class Offer_06_Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fibonacci(35));
    }
    //递归的方式,时间复杂度n(n^2)
    public static int  Fibonacci(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else {
           return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }
    //
}
