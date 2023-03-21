package io.rachidassouani.proxy.example2;

public class Application {
    public static void main(String[] args) {
        IProductService product1 = new ProductProxyServiceImpl("product1");
        IProductService product2 = new ProductServiceImpl("product2");

        product1.getInfo();
        product2.getInfo();
    }
}
