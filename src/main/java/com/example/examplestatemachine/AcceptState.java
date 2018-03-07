package com.example.examplestatemachine;

public class AcceptState extends State {

    public AcceptState(StateContext sc) {
        this.sc = sc;
        this.accept = true;
    }

    @Override
    public void actionA() {
        if(sc.getFirstAction() == Action.NULL) {
            sc.setFirstAction(Action.A);
        }

        if(sc.getFirstAction() == Action.A) {
            sc.setState(sc.getAcceptState());
        } else {
            sc.setState(sc.getRejectState());
        }
    }

    @Override
    public void actionB() {
        if(sc.getFirstAction() == Action.NULL) {
            sc.setFirstAction(Action.B);
        }

        if(sc.getFirstAction() == Action.B) {
            sc.setState(sc.getAcceptState());
        } else {
            sc.setState(sc.getRejectState());
        }
    }
}