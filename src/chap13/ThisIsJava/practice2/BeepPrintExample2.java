package chap13.ThisIsJava.practice2;

import java.awt.*;

public class BeepPrintExample2 {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Thread th1 = new Thread(new MyThread());
        th1.start();
        for(int i=0;i<5;i++){
            toolkit.beep();
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
        }
    }
}

class MyThread implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("떙");
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){}
        }
    }
}