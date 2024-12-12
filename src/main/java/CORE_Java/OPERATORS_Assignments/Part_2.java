package CORE_Java.OPERATORS_Assignments;
/*
Core Java with OCJP/SCJP: Operators & Assignments Part-2 || Concatenation,Relational,equality

string conciliation operator
        the only overloaded operator in java is + operato
        some time ack as arthematic addition operator and some time it acts as string conciliation operators
        18
 Core Java with OCJP/SCJP: Operators & Assignments Part-2
|| Concatenation,Relational,equality
 String conconitation operation (+)
 At least one argument is string type then + opp acts as conctination operator and if both
arguments are num type then + opp acts as arithmetic addition opp;
 String a=”aman”;
 Int b=10;
 Int c=20;
 Int d=30;
 sout(a+b+c+d); aman102030
 sout(b+c+d+a);60aman
 sout(b+c+a+d);30aman30
 sout(b+a+c+d);10aman2030
 Consider the following declearn String a=”aman”;
 Int b=10;
 Int c=20;
 Int d=30;
 Which of the following expression are valid
a=b+c+d; error incompatible type error;
 a=a+c+d; valid
 b=a+c+d error
 b=b+c+d valid
Relational operator
(<,<=,>,>=)
 We can apply relational operator for every primitive type except boolean
Sout (10<29); true
sout(‘a’<10);flase
sout(‘a’<97.0);true
 sout(‘a’>’A’);true
 sout(true>false);compile type error
sout(“aman123”>”aman”); invalid compie type error
We  cant apply relational operator for object type
sout(10<20); true
 sout(10<20<30); compile time error
 Nesting of relational operators are not allowed  otherwise we will get compile type error
Equality operator (==,!=)
 We can apply equality operator for every premity type including boolean type also
Example
 sout(10==20); false;
 sout(‘a’==’v’;false
 sout(‘a’==90.0);true
 sout(false==false);true
 We can also use equality operator for object type also
Equloty opper ment for reference comparison or address comparison
We can apply equality operator for object type also
For object reference r1==r2 return true if and only if both the object pointing to the same
object or address reference compression are address comparison ;
What is difference between == operator and .equal() method
== opp made for reference comparison by .equal() made for content comparison



 */
public class Part_2 {
}
