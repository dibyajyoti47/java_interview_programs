package multithreading;

public class WaitNotifyExample {
    public static void main(String[] args) {
        Shared s = new Shared();
        new Thread(()->s.methodOne()).start();
        new Thread(()->s.methodTwo()).start();
    }

}
class Shared {
    public synchronized void  methodOne () {
        System.out.println("mrthod one started");

        try {
            wait();
        } catch (Exception e) {}
        System.out.println("method one ended");
    }
    public synchronized void  methodTwo () {
        System.out.println("method two started");
        try {
            notify();
            Thread.sleep(2000);
        } catch (Exception e) {}
        System.out.println("method two ended");
    }
}