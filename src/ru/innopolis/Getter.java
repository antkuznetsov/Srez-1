package ru.innopolis;

import ru.innopolis.models.Storage;

/**
 * Created by Kuznetsov on 12/04/2017.
 */
public class Getter implements Runnable {

    private Storage s;
    Thread t = new Thread(this, "Getter");

    public Getter(Storage s) {

        this.s = s;
        t.start();

    }

    @Override
    public void run() {

        while (true) {
            s.getResult();
            try {
                t.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}