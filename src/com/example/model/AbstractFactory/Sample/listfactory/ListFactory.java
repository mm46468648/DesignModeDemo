package com.example.model.AbstractFactory.Sample.listfactory;

import com.example.model.AbstractFactory.Sample.factory.Factory;
import com.example.model.AbstractFactory.Sample.factory.Link;
import com.example.model.AbstractFactory.Sample.factory.Page;
import com.example.model.AbstractFactory.Sample.factory.Tray;

public class ListFactory extends Factory {
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
