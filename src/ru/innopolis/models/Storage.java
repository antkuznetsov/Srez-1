package ru.innopolis.models;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kuznetsov on 12/04/2017.
 */

public class Storage {

    private Map<Integer, Integer> st = new HashMap<>();

    synchronized public void add() {

        try {

            int num = (int) (Math.random() * 100);

            if (!st.containsKey(num)) {

                st.put(num, 1);

            } else {

                st.put(num, st.get(num) + 1);

            }

            //System.out.println(num + " " + st.get(num));

        } catch (NullPointerException e) {

            System.out.println("Something is wrong");

        }
    }

    synchronized public void getResult() {
        System.out.println("-------------------");
        for (Map.Entry entry : st.entrySet()) {
            System.out.println("Число " + entry.getKey() + " встречено " + entry.getValue() + " раз");
        }
    }

}