package com.example.model.Adapter.Sample1;

import com.example.model.Adapter.Sample2.Banner;

public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }
    public void printWeak() {
        showWithParen();
    }
    public void printStrong() {
        showWithAster();
    }
}
