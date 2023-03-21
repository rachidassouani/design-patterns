package io.rachidassouani.singleton;

public class Application {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        singleton1.printData();

        Singleton singleton2 =  Singleton.getInstance();
        singleton2.printData();

        Singleton singleton3 =  Singleton.getInstance();
        singleton3.printData();
    }

}
