package org.example.company;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> The Holden engine starts quietly";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> The Holden picks up speed quickly";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " The Holden slows to a smooth stop";
    }
}
