package com.example.model.Bridge.A3;

import com.example.model.Bridge.Sample.Display;
import com.example.model.Bridge.Sample.DisplayImpl;

public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }
    public void multiDisplay(int times) {       // 循环显示times次
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
