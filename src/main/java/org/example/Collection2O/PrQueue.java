package org.example.Collection2O;

import java.util.PriorityQueue;
import java.util.Queue;

public class PrQueue {
    public static void main(String[] args) {
        Queue<Integer> peq= new PriorityQueue<>();

        peq.add(12);
        peq.add(19);
        peq.add(17);
        peq.add(18);
        peq.add(17);
        peq.add(16);
        peq.add(15);
        peq.add(14);
        peq.add(13);
        peq.add(12);

        System.out.println(peq);
    }
}
