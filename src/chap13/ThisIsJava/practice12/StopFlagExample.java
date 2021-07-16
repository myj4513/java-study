package chap13.ThisIsJava.practice12;

public class StopFlagExample {
    public static void main(String[] args) {
        PrintThread thread = new PrintThread();

        thread.start();
        try{
            Thread.sleep(500);
        } catch(InterruptedException e){}
        thread.stop = true;
    }
}

class PrintThread extends Thread{
    public boolean stop = false;
    @Override
    public void run(){
        while(!stop){
            System.out.println("실행중!");
            try{
                Thread.sleep(100);
            } catch(InterruptedException e){}
        }
        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}