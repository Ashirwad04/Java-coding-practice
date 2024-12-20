package CORE_Java.AccessModifier;

/*
35 / 199
 Core Java With OCJP/SCJP: Declarations and
 Access Modifiers Part-6|| Class Level Modifiers:
 abstract
 Abstract is a modifier applicable for class and method but not for variables
 Abstract modifiers
 Even though we don't know about implementation still we can declare a method with
 abstract modifiers that is for abstract method only declaration is available but not
 implementation
 Heans abstract method declaration should end with semi colon ;
 Child class is responsible for parent class abstract methods
 Abstract method never talks about implementation if any modifier talk about
 implementation then it form illegal combination with abstract modifiers
 The following are illegal combination of modifiers for method with respect to abstract
 Final
 Native
 Synchronized
 Static
 Private
 Strictfp
 What is abstract class
 For any java class if we are not allowed to create an object (Because of partial
 implementation ) such type of class we have to declare with abstract modifiers .
 That is for abstract class institution is not possible .
Abstract class vs abstract method
 If a class contains at least one abstract method then compulsory we should declare
 class as abstract otherwise we will get compile time error if a class contains at least one
 abstract method then implement is not complete and hence it is not recommended to
 create an object to restrict object creation we should declare class as abstract .
 Even though class does not conation any abstract method if we don't want institution
 that is abstract class can contain 0 number of abstract method also
 If we are extension abstract class then for each and evert abstract method of abstract
 class we should provid implementayin other wise we should declare child class as
 abstract.
 In this class next level child class is responsible to provide implementation
 Final vs abstract
 Abstract method compulsory we should we override in child class to provide
 implementation where as we cant override final method hence final abstract
 combination is illegal combination for methods .

 */
public class Part_6 {
}
