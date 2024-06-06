package org.example.Basick5;

public class StringReverse {
    public static void main(String[] args) {
        String str="abcdefgh";
        int n = str.length()-1;
        String reversed = "";
        for (int i=n;i>0;i--){
            //System.out.print(str.charAt(i));
            reversed += str.charAt(i);
        }

        System.out.println(reversed);
    }
}
