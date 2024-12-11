package CORE_Java.LanguageFundamental;
/*
Language Fundamentals Part-13 || main() method part-1
 Weather class contain main method or not where main method main method is declared
 required or not this thing will not checked by the compile at run time run time is
 responsible to check this if jvm is unable to find the main method then we will get run
 time exception saying no shuch method error main ();
 Example
 Class Test
 {
 }
 In this case
 At run time jvm always searches for the main method with the following prototype
 public static void main(String [] args)
 {
 }
 To call by jvm main method should be public
 Withod existing any object this jvm should call it thats why it is static
 Main method wont any thing to jvm thats why void
 Main is the the name what is configuren in jvm
 String [ ] argos is command line argument
Even thow above syntax is very strict bt following changes are adaptable
 1- instead of public static we can take static public because the order of modifier is not
 imp
 2- we can declare array in any actable form string [] argos , string [] argos , string
 argos []
 3- insed of args we can take any valid java identifiers man (string[] ashu)
 4- we can replace string array with var args parametrised method
 main(string … args)
 5- we can declare main method with following
Final syncronized strictfp
 */
public class Part_13_mainmethod {
}
