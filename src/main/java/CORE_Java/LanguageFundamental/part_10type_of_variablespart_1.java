package CORE_Java.LanguageFundamental;
/*
Part-10_Types of Variables : part-1
 Based on type of values represented buy a variable all variable are divided into 2 types
 1- primitive variable
 Can be used to represent primitive values
 Int x = 10;
 2- reference variable
 can be used to refer objects
 Student s= new student();
 Based on position of declaration and behavior all variable they are divided into 3 types
 1-instance variable
 If the value of the variable varied from object to object such type of variable are
 called instance variables
 For Every object a separate copy of instance variable is created
 Vassible should be created inside the class but outside the method or constructor
 It is created at the time of object creation & distruction at the time of object
 destruction the scope of this variable is the same as object.
 The object is stored in heap memory so the instance variable will also be stored
 in heap memory as a part of the object .
 Wecan't access instance variables directly from the static area but we can
 access object reference but we can access instance variables directly from the
 instance area .
 For instance variable jvm will always provide default value and we are not able to
 perform initialization explicitly .
 Instance variables are also known as object level variable and attribute .
2- static variables
 If the value of a variable is not varied from object to object then it is not
 recommended to declare a variable as an instance variable. We have to declare
 such a type of variable as class level by using static modifiers .
 In the case of instance variables for every object a separated copy will be
 created but in the case of a static variable a single copy will be created at class
 level and shared by every object of the class .
 Static variables should be declared within the class directly but outside of any
 method or block or constructor .
 Scope variables will be created at the time of class loading and destroyed at time
 of class unloading hence the scope of static variables is the same as scope of
 .class file .
 Static variables will be stored in method area
 Wecan access static variables either object reference or class name but
 recommend using class name .
 within the same class its not required to use class name and can be used directly
 Wecan access static variables from both instances and the static areas.
 Static variables are also known as class level variables or fields .
 3 local variables

 */

public class part_10type_of_variablespart_1 {
}
