package CORE_Java.AccessModifier;
/*
34 / 199
 Core Java With OCJP/SCJP: Declarations and
 Access Modifiers Part-5 || Class Level Modifiers:
 f
 inal
 Class level modifiers
 Whenever we are writing our own classes we have to provice some information about
 our class to jvm
 Like
 1)where this class can be accessible from anywhere or not
 2)where child class creation is posible or not;
 3)Where object creation is posible or not;
 ETC
Wecan specify this information by using appropriate modifiers
 Total modifiers
 Public allowed
 Private
 Default allowed
 Protected
 Final allowed
 Abstract allowed
 Static
 Synchronised
 Nativ
 Strict-fp allowed
 Transient
 Volatile
 The only applicable modifiers for top level classes are- public, default,final , abstract ,
 strictFp
 But for inner class the applicable modifiers are public, default,final , abstract , strictFp
 Private,protected ,static
For top level class 5 are allowed
 For inner class 8 are allowed
 Deference between access modifier and access specifier
 Public private proted default are considered as access specifiers except there remaining
 are considered as modifiers but this rule is applicable only for old language like c++ but
 not in java
 In java all are considered as modifiers only there are no word like specifier in java
 Public classes
 If a class is declared as public then we can access that from any where
 If class a is not public then while compiling b class we will get compile time wee saying
 package A is not public in package
 Default class
 If the class is public then we can access that class only within the current package
 That is from outside package we can't access .
 Hence default level access is also known as package level access
 Final modifiers
 Final is a modifier applicable for classes methods and variables
 Final method
 What erever method parent has by default available to the child through inheratcane if
 the child not setisfiied with parent level implementation then child is allowed to redefined
 that method based on its requirement this method is class overriding
If the parent claas method id declared as final then we cant override that method in child
 class because its implementation is final .
 Final class
 If a class declares as final we cant extend functionality of the class we cant create child
 class for that class
 Inheritance is not possible for final classes
 Every method or variable present in final class is by default final

 */

public class Part_5 {
}
