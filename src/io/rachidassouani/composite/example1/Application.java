package io.rachidassouani.composite.example1;

public class Application {
    public static void main(String[] args) {
        Folder eshopProject = new Folder("/");
        Folder controller = new Folder("controller");

        eshopProject.addChild(new Folder("src"));
        eshopProject.addChild(controller);
        controller.addChild(new File("ProductController.java"));

        eshopProject.addChild(new File("config.xml"));

        eshopProject.print();
    }
}
