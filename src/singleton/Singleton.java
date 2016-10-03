package singleton;

public class Singleton {
    private static Singleton instance = new Singleton();

    //make constructor private s.t. this class cannot be instantiated
    private Singleton(){}

    //get the only object available
    public static Singleton getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello world!");
    }

}
