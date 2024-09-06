package de.telran._lesson_JavaFurQA_1_20240906;

public class Cone extends WeightedObject3D {
    @Override
    public String name() {
        return "Cone";
    }

    @Override
    public float volume() {
        float volume = (float) (Math.PI * radius * radius * height / 3.0);
        return volume;
    }

    private float radius;
    private float height;

    public Cone(float radius, float height, float densyty) {
        super(densyty);
        this.radius = radius;
        this.height = height;
    }

    public float getRadius() {
        return radius;
    }

    public float getHeight() {
        return height;
    }
}
