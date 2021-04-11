package dj.programming.journaldevtopfifty;

public class Fibonacci {
    public static void main(String[] args) {
//        printFibonacciForLoop(5);
        System.out.println(fibonacciRecursive(5));
    }
    private static void printFibonacciForLoop ( int count) {
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i=1; i<=count;i++) {
            System.out.print(a+" , ");
            a=b;
            b=c;
            c=a+b;
        }
    }

    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}
