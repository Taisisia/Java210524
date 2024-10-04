package de.telran._lesson_JavaForQA_1_20240906;

public class Cube extends WeightedObject3D {
    @Override
    public String name() {
        return "Cube";
    }

    @Override
    public float volume() {
        float volume = size * size * size;
        return volume;
    }

    private float size;

    public Cube(float size, float density) {
        super(density);
        this.size = size;
    }

    public float getSize() {
        return size;
    }

}
