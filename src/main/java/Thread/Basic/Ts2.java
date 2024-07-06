package Thread.Basic;



class Td extends Thread{


    public void run() {
        int count=1;
        while (true){
            System.out.println(count++);
        }
    }
}



public class Ts2 {


    public static void main(String[] args) {
        Td t=new Td();
        t.setDaemon(true);
        t.start();


    }
}

