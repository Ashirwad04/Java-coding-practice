package org.example.Basick5;

public class Prime_NUmberCheck {

    public boolean pmc(int n){

        boolean z = false;


        for (int i =2;i<n;i++){
            if (n%i != 0){
              return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Prime_NUmberCheck p=new Prime_NUmberCheck();
        int n =7;
        System.out.println(p.pmc(n));

    }
}
