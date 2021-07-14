package chap13.practice27;

public class practice {
    public static void main(String[] args) {
        MyThread th1 = new MyThread("*");
        MyThread th2 = new MyThread("**");
        MyThread th3 = new MyThread("***");
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
            Thread.sleep(3000);
            th3.stop();
        } catch(InterruptedException e){}
        System.out.println("main 쓰레드 종료");
    }
}

class MyThread implements Runnable{
    volatile boolean stopped = false;
    volatile boolean suspended = false;

    Thread th;

    MyThread(String name){
        th = new Thread(this, name);
    }

    public void start(){
        th.start();
    }

    public void run(){
        while(!stopped){
            if(!suspended){
                System.out.println(Thread.currentThread().getName());
                try{
                    Thread.sleep(1000);
                } catch(InterruptedException e){}
            }
        }
    }

    public void suspend(){
        this.suspended = true;
    }

    public void stop(){
        this.stopped = true;
    }

    public void resume(){
        this.suspended = false;
    }
}