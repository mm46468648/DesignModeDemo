package com.example.model.Strategy.Sample;

public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
