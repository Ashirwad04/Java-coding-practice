package Thread.Basic;

public class Ex2 extends Thread{
    public void run(){
        int i=0;
        while (true){
            System.out.println(i+"Hello");
        }
    }

    public static void main(String[] args) {
        Ex2 t=new Ex2();
        t.start();
        int i=0;
        while (true){
            System.out.println(i+"World");
        }
    }
}
