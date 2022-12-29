package com.example.model.Observer.Q1;

import com.example.model.Observer.A1.DigitObserver;
import com.example.model.Observer.A1.GraphObserver;
import com.example.model.Observer.A1.IncrementalNumberGenerator;
import com.example.model.Observer.A1.Observer;
import com.example.model.Observer.A1.NumberGenerator;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new IncrementalNumberGenerator(10, 50, 5);
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }
}
