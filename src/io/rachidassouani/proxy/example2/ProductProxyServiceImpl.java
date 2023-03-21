package io.rachidassouani.proxy.example2;

public class ProductProxyServiceImpl implements IProductService {

    private ProductServiceImpl productServiceImpl;
    private String name;

    public ProductProxyServiceImpl(String name) {
        this.name = name;
    }

    @Override
    public void getInfo() {
        System.out.print("BY PROXY ==> ");
        if (productServiceImpl == null)
            productServiceImpl = new ProductServiceImpl(name);
        productServiceImpl.getInfo();
    }
}
