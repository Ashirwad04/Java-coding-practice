package CORE_Java.LanguageFundamental;
/*
1 intro
2 array declaration
3 array creation
4 array initialization
5 array declare create initialization in a single line
6 length vs length()
7 anonymous array
8 array element assignment
9 array variable assignments



intro
an aray in and indexed collection of fixed no of homogeneous data elements
- we can represent huge no of element using single variable
-Arrays are Fixed in size.
- hens to use array concept compulsory we have to know the size of the array which may not possible always.
-Arrays can hold homogeneous elements
-


Array declaration
one dimension array  declaration,

int[]  x; best
int []x;
int x[];

int[10] x; error compile time error



Two-dimension array  declaration,

all valid;
int [][]x;
int x[][];
int[]  []x;
int[]x[];


if we want to specify dimension before the variable that facility is applicable only for first varrible in a declearation.
if we try to apply next Appling onwards we will get a compile-time error.


Three-dimension array  declaration,

int [][][]a;
int [][][]a;
int a[][][];
int [] a[][];
int []a[][];
int [][]a[];
all valid



every array in Java is object only hence we can create an array by using a new operator

Array Creation
int [] a= new int [3];

For every array type corresponding class are available and these classes are part of Java language and not available to programmer-level

Array type Corresponding class name
itn [] [I
int [][] [[I
double[] [D
short[] [S
byte[] [B
Boolean [Z

loop hole for in array creation :-

int [] x= new int []; compile time error
at the time of array creation compolasy we have to specify the size other wise we will get compile time error

int [] x= new int [10];


int [] x = new int[0];
it is legal to have an array of size 0


run time error:- negative array size exception
int [] x= new int [-3];

int [] x= new int [10];

int [] x= new int['a']; allowed because it will assign size of a

to specify the allowed data types are byte short car int ;
if we try to specify any other type then we will get compile time error



maximum allowed array size is 2747483647 the size of the int;
if we use exudes the range integer number to large error

 2747483647X4 bytes size required to make this array ;
max allowed array size is 2747483647 which is a max value of int data type
 */
public class Part6Array_1 {
}
