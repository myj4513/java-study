package chap13.practice2;

public class ThreadEx2 {
    public static void main(String[] args) {
        ThreadEx2_1 t = new ThreadEx2_1();
        t.start();
    }
}

class ThreadEx2_1 extends Thread{
    public void run(){
        throwException();
    }

    public void throwException(){
        try{
            throw new Exception();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
