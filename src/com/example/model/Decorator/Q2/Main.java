package com.example.model.Decorator.Q2;


import com.example.model.Decorator.A2.Display;
import com.example.model.Decorator.A2.FullBorder;
import com.example.model.Decorator.A2.MultiStringDisplay;
import com.example.model.Decorator.A2.SideBorder;

public class Main {
    public static void main(String[] args) {
        MultiStringDisplay md = new MultiStringDisplay();
        md.add("早上好。");
        md.add("下午好。");
        md.add("晚安，明天见。");
        md.show();

        Display d1 = new SideBorder(md, '#');
        d1.show();

        Display d2 = new FullBorder(md);
        d2.show();
    }
}
