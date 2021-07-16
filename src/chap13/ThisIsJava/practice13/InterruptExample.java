package chap13.ThisIsJava.practice13;

public class InterruptExample {
    public static void main(String[] args) {
        PrintThread printThread = new PrintThread();
        printThread.start();

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){}
        printThread.interrupt();
    }
}

class PrintThread extends Thread{
    @Override
    public void run(){
        try{
            while(true){
                System.out.println("실행중");
                Thread.sleep(100);
            }
        } catch(InterruptedException e){}
        System.out.println("자원 정리\n실행 종료");
    }
}
