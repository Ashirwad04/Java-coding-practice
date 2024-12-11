package CORE_Java.LanguageFundamental;

/*


Array variable assignments
 Case 1
 Int [ ] x={12,23,345,46}
 Char[ ] ch={‘d’,’f’,’w’,’e’}
 —--------------------------
Int [ ] b=x; valid
 Int [ ] c=ch; in valid compile time error
 Car type can be promoted to int type by char array cannot be promoted to int array
 Which of the following promotions will be performed automatically
 Char to int ok
 Char[] to int []no
 Int to double ok
 Int [] to double []no
 Dubar to int no
 Float [] to int [] no
 String to object yes
 String [] to object[]yes
 But in the case of object type array child class type array can be promoted to parent
 class type array
 String [] s={“1”,”b”,”c”}
 Object[] a=s;
Case 2
 Int a={12,23,45,56,7,998};
 Int [] b={45,46};
 a=b valid
 b=a valid
 Whenever we are assigning one array to another array internally element wont be
 copied just the reference variable will be re assigned .
 Case 3
 Int [][] a= new int [3][];
 a[0]= new int [4][3]; compile time error incomparable type array
 a[0]=10; incomparable type error found int required int []
 a[0]= new int [z]; valid
 Whenever we are assigning one array to another array the dimension must be matched
 for example one dimensional int array we should provide one d array only of we are
 trying to provide any other dimension we will get compile time error .
 Whenever we are assigning one array to another array both dimension and ttype must
 be matched but sizes are not required to match

 */

public class part9_Array_4 {
}
