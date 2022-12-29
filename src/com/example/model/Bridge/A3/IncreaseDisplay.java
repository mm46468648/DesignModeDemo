package com.example.model.Bridge.A3;

import com.example.model.Bridge.Sample.CountDisplay;
import com.example.model.Bridge.Sample.DisplayImpl;

public class IncreaseDisplay extends CountDisplay {
    private int step; // 递增步长
    public IncreaseDisplay(DisplayImpl impl, int step) {
        super(impl);
        this.step = step;
    }
    public void increaseDisplay(int level) {
        int count = 0;
        for (int i = 0; i < level; i++) {
            multiDisplay(count);
            count += step;
        }
    }
}
