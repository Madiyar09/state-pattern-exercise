package com.example.examplestatemachine;

public class StateContext {
    private State acceptState;
    private State rejectState;
    private State s;
    private Action firstAction;

    public StateContext() {
        this.rejectState = new RejectState(this);
        this.acceptState = new AcceptState(this);
        s = rejectState;
        firstAction = Action.NULL;
    }

    public void actionA() {
        s.actionA();
    }

    public void actionB() {
        s.actionB();
    }

    public boolean isAccept() {
        return s.accept;
    }

    public void setState(State state) {
        s = state;
    }

    public State getAcceptState() {
        return acceptState;
    }

    public State getRejectState() {
        return rejectState;
    }

    public void setFirstAction(Action firstAction) {
        this.firstAction = firstAction;
    }

    public Action getFirstAction() {
        return firstAction;
    }
}
