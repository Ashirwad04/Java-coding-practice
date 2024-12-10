package CORE_Java.LanguageFundamental;
/*
 Data types
        - java is very strongly typed prog language
        - each and every data type is clearly defined
        - every assignment is checked by compiler for type compatibility.
        -because of above resign we can conclude java is strongly typed programing language .

        java is not pure object oriented programing language
             -competition with c++ java have more oops features . that's why people thik java is pure oops language .


             several oops feature are not satisfied in java
             like -
                operator overloading
                - multiple inheritance
                - more over we are depending on primitive data type which are non objects .




                                                                                               +------------------+
                                                                               |  Primitive Types |
                                                                               +------------------+
                                                                                        |
                                                                +---------------------------------------------+
                                                                |                                             |
                                                            +-------+                                   +-------------+
                                                            | Numeric|                                   | Non-Numeric |
                                                            +-------+                                   +-------------+
                                                                |                                             |
                                                            +-----------+                            +-----------------+
                                                            | Integral  |                            |   Boolean Type  |
                                                            +-----------+                            +-----------------+
                                                                |                                             |
                                                            +-----------+                     +-------------+ +------------+
                                                            | Integer   |                     |  Boolean    | | Character  |
                                                            +-----------+                     +-------------+ +------------+
                                                                |                                             |
                                                            +-----------+              +------------+ +------------------+
                                                            |   byte    |              |  char      |
                                                            +-----------+              +------------+
                                                            |   short   |
                                                            +-----------+
                                                            |    int    |
                                                            +-----------+
                                                            |   long    |
                                                            +-----------+
                                                            |Floating point +---------> float
                                                            + double



            except boolean and care remaining data type are considered as signed data type because we can represent both positive and negative data types

            byte data type
            1 byte can store 8 bits
            0 th position is reserved for sign (-)
            +----+----+----+----+----+----+----+----+
            |+-  | 1  |  1 | 1  |1  | 1  |  1 |   1 |
            +----+----+----+----+----+----+----+----+
                 2*6    2*5 2*4  2*3  2*2   2*1  2*0

                 64+32+16+8+4+2+1
                 =127

            the max value we can store is +127
            the min value we can store is -128

            range -128 to +127 if we use out of this range we will get error possible loss of percision (pop)

            0 mins positive no and 1 mins negative

            positive will directly in memory

            byte b = true - error we get incompatible type found boolean required : byte

            where byte data type is best choice
                if we want to store data in form of streams
                    because streams  support byte data type - weather from the file or network


    Short Data type
        - short is the most les used data type
        size 2 bytes (16 bits)
        range -2*15 to 2*15-1 = [-32768 to 32767]

        short data type is best stable for 16 bit processors like 8085 bt these processors are completely outdated
        hens short data type is also outdated data type





        int data type

        the most common used data type is int
        size 4 4 bytes(32 bits)
        range -2*31 to 2*31-1 [-2147483648 to 2147483647]
        int x=798989898989898989898989898;
        if we use out side of range we will get error inter number is too large .

         int x=798989898989898989898989898l; naw we will get pop


 */

public class Part2 {
}
