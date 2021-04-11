package dj.programming.journaldevtopfifty;

public class CheckPrime {
    public static void main(String[] args) {
        int number = 2;
        boolean isPrime = true;
        if (number==0 || number==1) isPrime = false;
        for (int i=2; i<number;i++) {
            if (number%i == 0) {
                isPrime=false;
                break;
            }
        }
        System.out.println(isPrime);
    }
}
