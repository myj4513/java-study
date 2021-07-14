package chap13.exercise7;

public class Exercise13_7 {
    static boolean stopped = false;

    public static void main(String[] args) {
        Thread5 th1 = new Thread5();
        th1.start();

        try{
            Thread.sleep(6000);
        } catch(InterruptedException e){}

        stopped = true;
        th1.interrupt();
        System.out.println("stopped");
    }
}

class Thread5 extends Thread{
    public void run(){
        for(int i=0;!Exercise13_7.stopped;i++){
            System.out.println(i);
            try{
                Thread.sleep(3000);
            } catch(InterruptedException e){}
        }
    }
}
