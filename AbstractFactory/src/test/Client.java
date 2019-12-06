package test;

import abstractFactory.CarFactory;
import abstractFactory.Engine;
import abstractFactory.LuxuryCarFactory;

public class Client {
    public static void main(String[] args) {
        CarFactory luxFactory = new LuxuryCarFactory();
        Engine engine = luxFactory.createEngine();
        engine.start();
        engine.run();
    }
}
