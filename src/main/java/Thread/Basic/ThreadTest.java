package Thread.Basic;

import org.w3c.dom.ls.LSOutput;

class MyThread extends Thread{
    public MyThread(String name){
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }
    public void run(){
        int count=1;
        while (true){
            System.out.println(count++);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}




//class MyRun implements Runnable{
//
//    @Override
//    public void run() {
//
//    }
//}

public class ThreadTest {

    public static void main(String[] args) {
        //  Thread t= new Thread(new MyRun());

        MyThread t=new MyThread("My Thread 1");
        System.out.println(t.getId());
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        t.start();
        System.out.println(t.getState());
        System.out.println(t.isAlive());


    }


}
