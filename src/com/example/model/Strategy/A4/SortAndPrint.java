package com.example.model.Strategy.A4;

import com.example.model.Strategy.Q4.Sorter;

public class SortAndPrint {
    Comparable[] data;
    com.example.model.Strategy.Q4.Sorter sorter;
    public SortAndPrint(Comparable[] data, Sorter sorter) {
        this.data = data;
        this.sorter = sorter;
    }
    public void execute() {
        print();
        sorter.sort(data);
        print();
    }
    public void print() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ", ");
        }
        System.out.println("");
    }
}
