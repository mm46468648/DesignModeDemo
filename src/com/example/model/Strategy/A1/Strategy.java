package com.example.model.Strategy.A1;


public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
