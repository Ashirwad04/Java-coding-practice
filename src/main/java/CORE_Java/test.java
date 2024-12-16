package CORE_Java;

import Employee.Main;

public class test {

    public static void main(String[] args) {
        int a =10;
        int b = 20;
        //add a ,b
        int sum = a + b;
        System.out.println("Sum is: " + sum);

        //perform all operation on ab and b
        int result = (a + b) * b;
        System.out.println("Result is: " + result);

        //swap a and b
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping a is: " + a + " and b is: " + b);

        //multiply a and b
        result = a * b;
        System.out.println("Result is: " + result);

        //divide a and b
        result = a / b;
        System.out.println("Result is: " + result);

        //modulo operation
        result = a % b;
        System.out.println("Result is: " + result);

    }
}
