package chap13.practice14;

public class Test {
    public static void main(String[] args) {
        ThreadTest t = new ThreadTest();
        t.start();
        t.interrupt();
        System.out.println("interrupt 헀음");
        System.out.println(t.interrupted());
    }
}

class ThreadTest extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){}
        }
    }
}