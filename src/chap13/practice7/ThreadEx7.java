package chap13.practice7;

import javax.swing.JOptionPane;

public class ThreadEx7 {
    public static void main(String[] args) {
        ThreadEx7_1 t = new ThreadEx7_1();
        t.start();
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력한 값은 "+input+"입니다.");
    }

}

class ThreadEx7_1 extends Thread{
    public void run(){
        for(int i=10;i>0;i--){
            System.out.println(i);
            try{
                sleep(1000);
            } catch(Exception e){}
        }
    }
}
