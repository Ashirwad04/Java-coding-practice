package Thread.Basic;

public class Ex3 implements Runnable{
    @Override
    public void run() {
        int i=0;
        while (true){
            System.out.println(i+"Hello");
        }
    }

    public static void main(String[] args) {

        Ex3 t= new Ex3();
        Thread th= new Thread(t);
        th.start();


        int i=0;
        while (true){
            System.out.println(i+"World");
        }
    }
}
