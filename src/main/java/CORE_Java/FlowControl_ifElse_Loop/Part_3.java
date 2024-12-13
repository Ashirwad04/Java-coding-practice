package CORE_Java.FlowControl_ifElse_Loop;
/*
26 / 199
 Core Java with OCJP/SCJP: Flow-Control Part-3 ||
 Selection Statements : switch
 If several options are available then it is not recommended nested if else statement
 Because it refuses readability
 To handle this recruitment we shroud go for switch statement
 Syntax
 switch(x)
 {
 Case1:
 Case2:
 Case3:
 Case4:
 Action 1;
 Break;
 Action 2;
 Break;
 Action 3;
 Break;
 Action 4;
 Break;
 default :
 Default Action
 }
 What is the argument for the switch statement
 Byte
 Short
 Char
 Int
 Only allowed
Not allowed boolean , long , float , double
 If we sue thies then we will get compile time error
 Why booleans are not allowed like there are just 2 scenarios then we should go for if else.
 Long because these meny cases are not allowed
 Double in short there are infinite no of case that why not allowd
 But thiese case are vallied till 1.4 version
 But after 1.5 version wrapper class of this byte short char int enum are also allowed
 After 1.7 we can pass string type also
 Curly braces are mandatory in switch case except switch curly brasses are optional .
 Wecan also make empty switch case also so default is not mandatory
 Independent statements are not allowed
 Inside switch every statement should be case or default that is independent statement are not
 allowed in switch other wise we will get compile time error
 Every case level should be compile time constant that is constant expression
 Both switch argument and case level can be expressions but case level should be constant
 expression .
 Every case level should be in the range of switch argument type other wise we will get compile
 time error
 Duplicate case level are not allowed wise we will get compile time error
 Within the switch we can take default case at most once
 Default case will be executed if and only if there is no case match
 Withe the switch we can write default case any whare but it is recommend to write as last case

 */
public class Part_3 {
}
