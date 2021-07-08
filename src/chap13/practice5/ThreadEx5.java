package chap13.practice5;

public class ThreadEx5 {
    static long startTime = 0;
    public static void main(String[] args) {
        ThreadEx5_1 t1 = new ThreadEx5_1();
        ThreadEx5_2 t2 = new ThreadEx5_2();
        startTime = System.currentTimeMillis();
        t1.start();
        t2.start();
    }
}

class ThreadEx5_1 extends Thread{
    public void run(){
        for(int i=0;i<300;i++){
            System.out.printf("%s", new String("-"));
        }
        System.out.print("소요시간:"+(System.currentTimeMillis()-ThreadEx5.startTime));
    }
}

class ThreadEx5_2 extends Thread{
    public void run(){
        for(int i=0;i<300;i++){
            System.out.printf("%s", new String("|"));
        }
        System.out.print("소요시간:"+(System.currentTimeMillis()-ThreadEx5.startTime));
    }
}
