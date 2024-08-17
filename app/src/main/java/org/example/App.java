package org.example;

import java.util.ArrayList;
import java.util.List;

import com.example.java.OlivePress;
import com.example.java.Press;
import com.example.java.model.Kalamata;
import com.example.java.model.Ligurian;
import com.example.java.model.Olive;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        List<Olive> olives = new ArrayList<>();
        olives.add(new Kalamata());
        olives.add(new Ligurian());
        Press press = new OlivePress();
        int totalOil = press.getOil(olives);
        System.out.println("Total olive oil is " + totalOil);
    }
}