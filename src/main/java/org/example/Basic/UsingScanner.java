package org.example.Basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsingScanner {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the element to enter the int the list");
        int n = sc.nextInt();
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i =0;i<n;i++){
            int num = sc.nextInt();
            numbers.add(num);
        }

        for(Integer num :numbers){
            System.out.println(num);
        }


    }
}
