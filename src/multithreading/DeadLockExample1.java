package multithreading;

public class DeadLockExample1 {
    public static void main(String[] args)    {
        Shared s1 = new Shared();
        Shared s2 = new Shared();
        Runnable runnable1 = () -> s1.methodOne(s2);
        Runnable runnable2 = () -> s2.methodTwo(s1);
        new Thread(runnable1).start();
        new Thread(runnable2).start();
    }

    private static class Shared {
        synchronized void methodOne(Shared s)
        {
            Thread t = Thread.currentThread();
            System.out.println(t.getName()+"is executing methodOne...");
            System.out.println(t.getName()+"is calling methodTwo...");
            s.methodTwo(this);
            System.out.println(t.getName()+"is finished executing methodOne...");
        }

        synchronized void methodTwo(Shared s)
        {
            Thread t = Thread.currentThread();
            System.out.println(t.getName()+"is executing methodTwo...");
            System.out.println(t.getName()+"is calling methodOne...");
            s.methodOne(this);
            System.out.println(t.getName()+"is finished executing methodTwo...");
        }
    }
}


