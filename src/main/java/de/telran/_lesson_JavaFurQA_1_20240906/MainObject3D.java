package de.telran._lesson_JavaFurQA_1_20240906;

public class MainObject3D {

    public static float calculateWeight(WeightedObject3D objects[]) {
        float sumWeight = 0;
        for (int i = 0; i < objects.length; i++) {
            sumWeight += objects[i].weight();
        }
        return sumWeight;

    }

    public static void main(String[] args) {
        WeightedObject3D ball = new Ball(0.3f, 510);

        WeightedObject3D cone = new Cone(0.2f, 0.4f, 1500);

        WeightedObject3D cube = new Cube(0.5f, 510);

        WeightedObject3D weightedObject3D[] = new WeightedObject3D[]{// создаем массив объектов
                ball,
                cone,
                cube
        };
        System.out.println("Суммарный вес: " + calculateWeight(weightedObject3D ) + " кг");
    }
}
