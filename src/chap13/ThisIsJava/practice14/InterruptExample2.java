package chap13.ThisIsJava.practice14;

public class InterruptExample2 {
    public static void main(String[] args) {
        PrintThread thread = new PrintThread();
        thread.start();
        try{
            Thread.sleep(300);
        }catch(InterruptedException e){}
        thread.interrupt();
    }
}

class PrintThread extends Thread{
    @Override
    public void run(){
        while(true){
            if(interrupted()){
                break;
            }
            System.out.println("실행중");
            try{
                Thread.sleep(30);
            } catch(InterruptedException e){interrupt();}
        }
        System.out.println("자원 반납");
        System.out.println("실행 종료");
    }
}