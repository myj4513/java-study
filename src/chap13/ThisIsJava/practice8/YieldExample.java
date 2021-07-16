package chap13.ThisIsJava.practice8;

public class YieldExample {
    public static void main(String[] args) {
        ThreadA thA = new ThreadA();
        ThreadB thB = new ThreadB();

        thA.start();
        thB.start();
        try{
            Thread.sleep(2000);
        } catch(InterruptedException e){}
        thA.work = false;
        try{
            Thread.sleep(2000);
        } catch(InterruptedException e){}
        thA.work = true;
        try{
            Thread.sleep(2000);
        } catch(InterruptedException e){}
        thA.stop = true;
        thB.stop = true;
    }
}

class ThreadA extends Thread{
    public boolean stop = false;
    public boolean work = true;

    public void run(){
        while(!stop){
            if(work){
                System.out.println("ThreadA 작업내용");
                try{
                    Thread.sleep(100);
                } catch(InterruptedException e){}
            } else{
                Thread.yield();
            }
        }
        System.out.println("ThreadA 종료");
    }
}

class ThreadB extends Thread{
    public boolean stop = false;
    public boolean work = true;

    public void run(){
        while(!stop){
            if(work){
                System.out.println("ThreadB 작업내용");
                try{
                    Thread.sleep(100);
                } catch(InterruptedException e){}
            } else{
                Thread.yield();
            }
        }
        System.out.println("ThreadB 종료");
    }
}
