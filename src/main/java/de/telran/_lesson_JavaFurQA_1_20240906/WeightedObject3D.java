package de.telran._lesson_JavaFurQA_1_20240906;

public abstract class WeightedObject3D implements Object3D {

    float density;// плотность

    public float weight() { // вес
        float weight = density * volume();
        return weight;
    }


    public WeightedObject3D(float density) {
        this.density = density;
    }
}
