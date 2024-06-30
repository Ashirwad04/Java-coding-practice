package org.example.Collection2O;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList<>( 12);
        ArrayList all=new ArrayList<>( 12);


        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(8);
        al.add("a");
        al.add("abc");

        all.addAll(al);
//        System.out.println(all);
//        all.remove(7);
//        System.out.println(all);
//        all.remove("a");
//        System.out.println(all);
//        all.remove(Integer.valueOf(7));
//        System.out.println(all);
        System.out.println(all.get(0));







    }
}
