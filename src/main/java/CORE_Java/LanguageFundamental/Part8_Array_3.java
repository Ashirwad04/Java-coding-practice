package CORE_Java.LanguageFundamental;
/*
part 8 part 3  Array

Array declaration and creation and initialization in a single line

Int [ ] x;
x= new int [3];

x[0]=10;
x[1]=1;
x[2]=3;

Int [] x={0,1,2};

We can declare create and initialize an array in a single line as a shortcut representation .

We can also do this for a multimeter array .






Length vs length()
 Length :
Int [] x= new int [5];
sout(x.length()); 	- error- cannot find symbol method length location class int \
sout(x.lenght); ok work

Length is a final variable applicable for arrays.
Length varible represent the size of the array
Int [] x= new int [5];
sout(x.length());






Some time we can declare array without name that array is known as anonymous array
The main purpose of annum is just for instance just for one time use .
We can create anonymous array as follows

new int [] {12,42,45,3,5345,4345};
New int [43] {12,42,45,3,5345,4345}; compile time error

White creating anonymous array we cant specify the size other wise we will get compile time error


We can create a multidimensional anonymous array also

We can give name of anonymous array based on our recruitment then it will no longer anonymous


One time recordment anonymous array is best choice






Array element assignments

Case 1

int [] x= new int [4];
Int x[0]=10;
int[1]= ‘a’;


In the case of primitive type array as array element wee can provide any type which can be implicitly promoted to declared type

For int byte short and car is allowed



In float type array the allowed data type are byte short , int car long float


Case 2

Object [] a = new object[20];
a[0]= new object();
a[1]= new String (“DVDV”);
a[2]= new Integer (10);


In the case of object type array as array elements we can provide either declared typy object or its child class objects


Case 3

Runnable[ ] = new Runnable[10];

e[0]= new Thread();
r[1]= new String (“anan”); error

For interface type array as array elements its implements class objects are allowed .
 */
public class Part8_Array_3 {
}
