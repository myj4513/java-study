package chap13.ThisIsJava.practice16;

public class ThreadGroupExample {
    public static void main(String[] args) {
        ThreadGroup myGroup = new ThreadGroup("myGroup");
        WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
        WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");

        workThreadA.start();
        workThreadB.start();

        System.out.println("[main 스레드 그룹의 list() 메소드 출력 내용] ");
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        mainGroup.list();
        System.out.println();

        try{
            Thread.sleep(3000);
        } catch(InterruptedException e){}

        System.out.println("[main 스레드 그룹의 interrupt() 메소드 호출]");
        myGroup.interrupt();
    }
}

class WorkThread extends Thread{
    public WorkThread(ThreadGroup threadGroup, String threadName){
        super(threadGroup, threadName);
    }

    public void run(){
        while(true){
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){
                System.out.println(getName() + " interrupted");
                break;
            }
        }
        System.out.println(getName() + " 종료됨");
    }
}
