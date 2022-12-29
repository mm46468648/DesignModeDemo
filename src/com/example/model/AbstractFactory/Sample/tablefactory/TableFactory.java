package com.example.model.AbstractFactory.Sample.tablefactory;
import com.example.model.AbstractFactory.Sample.factory.Factory;
import com.example.model.AbstractFactory.Sample.factory.Link;
import com.example.model.AbstractFactory.Sample.factory.Page;
import com.example.model.AbstractFactory.Sample.factory.Tray;

public class TableFactory extends Factory {
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
