package Thread.Basic;
//Thread Class


public class Ex1 extends Thread{
    public void run(){

        int i=0;
        while (true){
            System.out.println(i+"Hello");
        }
    }


}

class Test{
    public static void main(String[] args) {
        Ex1 t=new Ex1();
        t.start();
        int i=0;
        while (true){
            System.out.println(i+"World");
        }
    }
}