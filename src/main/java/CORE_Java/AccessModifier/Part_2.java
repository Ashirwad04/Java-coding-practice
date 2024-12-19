package CORE_Java.AccessModifier;
/*
31 / 199
 Core Java With OCJP/SCJP: Declarations and
 Access Modifiers Part-2 || import and static import
 Case 1
 Type of import statement
 Explicit class import
 Import java .utul.Al
 There are 2 type of import statement
 1) Explicit class import
 Implicit class Import
 import java.util*;
 It it highly recommended to use explicit class import because it
 improve readability of the code
 Best suitable for hi)tech city where readability is important
 2) Implicit class import
 Not recommended to use because it reduce readability of the code
 Best suitable for ammer because typing is important
 Case 2
 Import java.util.Al; valid
 Import java.util.Al.*; invalid
 Import java.util.*; valid
 Import java.util; in valid
 Case 3
 Consider the following code
 Class Myobject extend java.rmi.unicast remote object
 {
 }
 The code compile fine even tho we are not writing import statement because we use
 fully qualified name
Whenever we using fully qualified name it is not required to write import statement
 Whenever we are writing import statement it is not required to use fully qualified name
 Case 4
 Import java.util.*;
 Import java.sql.*;
 Class Test
 {
 psvm(string[]args)
 {
 Date d= new Date();
 }
 }
 Compile time error reference date
 Import java.util.* ; import java.sql.*; we will get compile time error saying date is
 ambiguous.
 If more no of imports are there then compile time will increase but run time will not going
 to impacted .
 Another type of import is Static import
 Introduced in 1.5 version

 */

public class Part_2 {
}
