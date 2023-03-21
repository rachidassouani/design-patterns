package io.rachidassouani.proxy.example1;

public class Application {
    public static void main(String[] args) {
        IService context1 = new ServiceImpl();
        System.out.println(context1.compute());

        // using proxy
        IService context2 = new Proxy();
        System.out.println(context2.compute());
    }
}
