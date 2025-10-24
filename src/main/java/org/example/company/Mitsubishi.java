package org.example.company;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> The Mitsubishi engine roars to life";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> The Mitsubishi speeds up smoothly";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " The Mitsubishi slows down efficiently";
    }
}
