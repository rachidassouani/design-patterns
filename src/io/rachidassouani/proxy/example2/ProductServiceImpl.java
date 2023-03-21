package io.rachidassouani.proxy.example2;

public class ProductServiceImpl implements IProductService {

    private String name;

    public ProductServiceImpl(String name) {
        this.name = name;
    }

    @Override
    public void getInfo() {
        System.out.println("Displaying information for " + name);
    }
}
