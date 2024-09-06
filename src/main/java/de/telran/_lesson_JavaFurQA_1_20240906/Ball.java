package de.telran._lesson_JavaFurQA_1_20240906;

public class Ball extends WeightedObject3D {
    @Override
    public String name() {
        return "Ball";
    }

    @Override
    public float volume() {
        float volume = (float) (Math.PI * 4.0 * radius * radius * radius / 3.0);
        return volume;
    }

    private float radius;

    public Ball(float radius, float density) {
        super(density);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

}
