package chap13.ThisIsJava.practice6;

public class ThreadStateExample {
    public static void main(String[] args) {
        StatePrintThread th1 = new StatePrintThread(new TargetThread());
        th1.start();
    }
}

class TargetThread extends Thread{
    public void run(){
        for(long i = 0;i<1000000000;i++){}

        try{
            Thread.sleep(1500);
        } catch(InterruptedException e){}
        for(long i = 0;i<1000000000;i++){}
    }
}

class StatePrintThread extends Thread{
    private Thread thread;

    public StatePrintThread(Thread targetThread){
        this.thread = targetThread;
    }

    public void run(){
        while(true){
            Thread.State state = thread.getState();
            System.out.println("타켓 스레드의 상태 : "+state);

            if(state == Thread.State.NEW){
                thread.start();
            }
            if(state == State.TERMINATED){
                break;
            }
            try{
                Thread.sleep(500);
            } catch(InterruptedException e){}
        }
    }
}