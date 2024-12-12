package CORE_Java.OPERATORS_Assignments;
/*
19 / 199
 Core Java with OCJP/SCJP: Operators &
Assignments Part-3 || instanceof, bitwise operator
 Instanceof operator
We can use instanceof operator to check where the given object is particular type or not
Example
Object o= l.get(0);
 if(o instanceof Student){
 Student s(Student)o;
 //perform student specific tast
 }
 elseIf(o instanceof Customent){
 Customer c=(Customer)o;
 //perform customer specific task
}
Sysnstax instance of
 R
Object reference
Null instanceof x
This will always false
 instanceof
Bitwise operator (& ,|,^)
 & return true if both arguments are true
 | return true at least one argument is true
^  x-or return true  if both argument are different
sout(true & false);false
 sout(true | false);true
sout(true ^ false);true
 We can apply bitwise for integral type also
sout(4&5);4
 sout(4|5);5
 sout(4^5);1
 x
 class or interface naem
Bitwise complement Operator (~)
 This opp is valid for only integral type cant appy for boolean
sout(~true ); false compile time error
sout(~4);-5
 &|^ applicable for both boolean and integral
~ applicable for integral type not for boolean type
! applicable for boolean type not for integral types
 */
public class Part_3 {
}
