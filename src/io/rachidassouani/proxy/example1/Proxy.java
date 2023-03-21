package io.rachidassouani.proxy.example1;

public class Proxy implements IService {

    private IService iService = new ServiceImpl();

    @Override
    public double compute() {
        System.out.println("by proxy");
        return iService.compute();
    }
}
