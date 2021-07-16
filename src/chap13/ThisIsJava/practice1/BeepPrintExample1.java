package chap13.ThisIsJava.practice1;

import java.awt.*;

public class BeepPrintExample1 {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for(int i=0;i<5;i++){
            toolkit.beep();
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){}
        }
        for(int i=0;i<5;i++){
            System.out.println("땡");
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){}
        }
    }
}
