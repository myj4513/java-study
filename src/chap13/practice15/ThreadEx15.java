package chap13.practice15;

public class ThreadEx15 {
    public static void main(String[] args) {
        Thread th1 = new Thread(new RunImpEx15(),"*");
        Thread th2 = new Thread(new RunImpEx15(),"**");
        Thread th3 = new Thread(new RunImpEx15(),"***");
        th1.start();
        th2.start();
        th3.start();
        try{
            Thread.sleep(2000);
            th1.suspend();
            Thread.sleep(2000);
            th2.suspend();
            Thread.sleep(3000);
            th1.resume();
            Thread.sleep(3000);
            th1.stop();
            th2.stop();
            Thread.sleep(2000);
            th3.stop();
        } catch(InterruptedException e){}
    }
}

class RunImpEx15 implements Runnable{
    public void run(){
        while(true){
            System.out.println(Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){}
        }
    }
}