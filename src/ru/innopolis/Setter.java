package ru.innopolis;

import ru.innopolis.models.Storage;

import static java.lang.Thread.sleep;

/**
 * Created by Kuznetsov on 12/04/2017.
 */

public class Setter implements Runnable {

    private Storage s;
    Thread t = new Thread(this, "Setter");

    public Setter(Storage s) {

        this.s = s;
        t.start();

    }

    @Override
    public void run() {

        while (true) {

            s.add();

            try {
                t.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
