package com.example.model.Visitor.A2;



import java.util.Iterator;
import java.util.ArrayList;

public class Directory extends Entry {
    private String name;                    // 文件夹名字
    private ArrayList dir = new ArrayList();      // 目录条目的集合
    public Directory(String name) {         // 构造函数
        this.name = name;
    }
    public String getName() {               // 获取名字
        return name;
    }
    public int getSize() {                  // 获取大小
        SizeVisitor v = new SizeVisitor();  
        accept(v);                          
        return v.getSize();                 
    }
    public Entry add(Entry entry) {         // 添加目录条目
        dir.add(entry);
        return this;
    }
    public Iterator iterator() {
        return dir.iterator();
    }
    public void accept(Visitor v) {
        v.visit(this);
    }
}
