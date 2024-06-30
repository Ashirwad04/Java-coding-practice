package org.example.Collection2O;

import java.util.Stack;

public class Stack01 {
    public static void main(String[] args) {
        Stack<Integer> ss=new Stack();
        ss.push(1);
        ss.add(2);
        ss.push(1);
        ss.remove(2);
        System.out.println(ss.peek());
        System.out.println(ss.get(0));
    }
}
