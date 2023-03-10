package com.example.model.Flyweight.A2;

import com.example.model.Flyweight.Sample.BigChar;

public class BigString {
    // 大型文字的数组
    private com.example.model.Flyweight.Sample.BigChar[] bigchars;
    // 构造函数
    public BigString(String string) {
        initShared(string);
    }
    // 构造函数
    public BigString(String string, boolean shared) {
        if (shared) {
            initShared(string);
        } else {
            initUnshared(string);
        }
    }
    // 共享方式初始化
    private void initShared(String string) {
        bigchars = new com.example.model.Flyweight.Sample.BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i] = factory.getBigChar(string.charAt(i)); 
        }
    }
    // 非共享方式初始化
    private void initUnshared(String string) {
        bigchars = new com.example.model.Flyweight.Sample.BigChar[string.length()];
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i] = new BigChar(string.charAt(i));
        }
    }
    // 显示
    public void print() {
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i].print();
        }
    }
}
