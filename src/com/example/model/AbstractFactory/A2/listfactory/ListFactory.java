package com.example.model.AbstractFactory.A2.listfactory;
import com.example.model.AbstractFactory.A2.factory.Factory;
import com.example.model.AbstractFactory.A2.factory.Link;
import com.example.model.AbstractFactory.A2.factory.Page;
import com.example.model.AbstractFactory.A2.factory.Tray;

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
