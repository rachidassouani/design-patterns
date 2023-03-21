package io.rachidassouani.state;

public class Mobile {
    private MobileAlertState currentState;

    public Mobile() {
        currentState = new Ringing();
    }

    public void setCurrentState(MobileAlertState state) {
        this.currentState = state;
    }

    public void alert() {
        currentState.alert();
    }
}
