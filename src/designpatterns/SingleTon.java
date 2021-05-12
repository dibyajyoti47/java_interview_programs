package designpatterns;

public class SingleTon{
    private static volatile SingleTon object;
    private SingleTon() {
        if (object!=null) throw new RuntimeException("Creating object is not allowed.");
        System.out.println("first object created");
    }
    public static SingleTon getInstance () {
        if (object == null) {
            synchronized (SingleTon.class) {
                if (object == null) { //double checking here, because multiple threads can reach above line
                    object = new SingleTon();
                }
            }
        }
        return object;
    }
}
