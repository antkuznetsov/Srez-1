package ru.innopolis;

import ru.innopolis.models.Storage;

public class Main {

    public static void main(String[] args) {

        Storage s = new Storage();

        new Setter(s);
        new Getter(s);

    }
}