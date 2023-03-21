package io.rachidassouani.state;

public class Application {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.alert();

        mobile.setCurrentState(new Silent());
        mobile.alert();
    }
}
