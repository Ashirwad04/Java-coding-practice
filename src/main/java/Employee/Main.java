package Employee;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        Employee e1 = new Employee(1, "ashu", 9995000);
        Employee e2 = new Employee(2, "karan", 6000);
        Employee e3 = new Employee(3, "ram", 54300);
        Employee e4 = new Employee(4, "arjun", 200);
        Employee e5 = new Employee(5, "aman", 546000);
        Employee e6 = new Employee(6, "kajal", 300);
        Employee e7 = new Employee(7, "krishna", 65000);
        Employee e8 = new Employee(8, "papu", 34000);
        Employee e9 = new Employee(9, "vinod", 32000);
        Employee e10 = new Employee(10, "Binod", 150);

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
        empList.add(e6);
        empList.add(e7);
        empList.add(e8);
        empList.add(e9);
        empList.add(e10);

        List<Employee> updatedEmpList = empList.stream()
                .map(emp -> {
                    if (emp.getSalary() < 1000) {
                        emp.setSalary(emp.getSalary() + 10000);
                    }
                    return emp;
                })
                .collect(Collectors.toList());

      //  updatedEmpList.forEach(emp ->
        //        System.out.println("ID: " + emp.getId() + ", Name: " + emp.getName() + ", Salary: " + emp.getSalary()));


        System.out.println(updatedEmpList);
    }
}
