package org.example.company;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " The Ford engine starts with a rumble";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " The Ford accelerates powerfully";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " The Ford brakes with confidence";
    }
}
