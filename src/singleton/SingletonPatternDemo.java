package singleton;

public class SingletonPatternDemo {
    public static void main(String[] args){
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage(); //show the message
    }
}