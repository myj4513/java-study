package chap13.exercise2;

public class Exercise13_2 {
    public static void main(String[] args) {
        Thread2 t1 = new Thread2();
        t1.run();

        for(int i=0;i<10;i++){
            System.out.print(i);
        }
    }
}

class Thread2 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.print(i);
        }
    }
}
//정답 b