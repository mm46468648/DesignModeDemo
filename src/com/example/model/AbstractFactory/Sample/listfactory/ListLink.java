package com.example.model.AbstractFactory.Sample.listfactory;

import com.example.model.AbstractFactory.Sample.factory.Link;

public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }
    public String makeHTML() {
        return "  <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
