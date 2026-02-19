package ioprogramming.reflectionannotation.reflection.advanced.inject;

public class Car {
    @Inject
    Engine engine;

    public void drive() {
        engine.start();
    }
}
