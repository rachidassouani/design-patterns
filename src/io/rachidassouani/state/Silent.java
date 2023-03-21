package io.rachidassouani.state;

public class Silent implements MobileAlertState {
    @Override
    public void alert() {
        System.out.println("Silent");
    }
}
