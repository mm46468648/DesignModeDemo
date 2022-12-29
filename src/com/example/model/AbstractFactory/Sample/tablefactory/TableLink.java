package com.example.model.AbstractFactory.Sample.tablefactory;

import com.example.model.AbstractFactory.Sample.factory.Link;

public class TableLink extends Link {
    public TableLink(String caption, String url) {
        super(caption, url);
    }
    public String makeHTML() {
        return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }
}
