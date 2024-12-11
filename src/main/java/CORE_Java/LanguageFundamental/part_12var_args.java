package CORE_Java.LanguageFundamental;


/*
Language Fundamentals Part-12 || var-arg methods
 This was introduced in 1.5 v of java
 Until 1.4 we cant declare with variable no of arguments if there is change in no of
 arguments compulsory we should go for new method it increases length of the code and
 reduce readability .
 To reduce this problem indrodused var argos method in 1.5 version
 According to this we can declare the method which can take variable no of arguments
 such type of method are called var argos methods.
 Wecan create this method as follows
 m1(int… x)
 Wecan call this method by passing any no int valu including 0 also ;
 Example
 Public static sum(int…x){
 Int total =0;
 for(int x1:x){
 total=total+x1;
 }
 sout(“the sum is “+total);
 }
 Internally this method will be converted into one dimensional array

 */
public class part_12var_args {
}
