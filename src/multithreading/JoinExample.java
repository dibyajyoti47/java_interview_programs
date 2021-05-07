package multithreading;

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()-> {
            System.out.print("{ ");
           for (int i=1; i<=10; i++) {
               System.out.print(i+" ");
           }
            System.out.println("} t1 complete..");
        });
        Thread t2 = new Thread(()-> {
            try {t1.join();} catch (InterruptedException e) {}
            System.out.print("{ ");
            for (int i=11; i<=20; i++) {
                System.out.print(i+" ");
            }
            System.out.println("} t2 complete..");
        });
        Thread t3 = new Thread(()-> {
            try{ t2.join();}catch (Exception e){}
            System.out.print("{ ");
            for (int i=21; i<=30; i++) {
                System.out.print(i+" ");
            }
            System.out.println("} t3 complete..");
        });
        t1.start();
        t2.start();
        t3.start();
        t3.join();
    }

}
