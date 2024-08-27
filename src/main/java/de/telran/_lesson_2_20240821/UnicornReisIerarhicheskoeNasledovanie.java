package de.telran._lesson_2_20240821;

public class UnicornReisIerarhicheskoeNasledovanie extends UnicornExt{
    int countPassengers;

    void transportPassendger () {
        System.out.println(name + " может возить пассажиров " + countPassengers + " пассажиров");
    }

    public UnicornReisIerarhicheskoeNasledovanie(String name, String color, int weight, int countHorn, int countPassengers) {
        super(name, color, weight, countHorn);
        this.countPassengers = countPassengers;
    }
}
