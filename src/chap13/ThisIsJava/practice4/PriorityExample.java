package chap13.ThisIsJava.practice4;

public class PriorityExample {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            MyThread thread = new MyThread();
            thread.setName("thread"+i);
            if(i!=10){
                thread.setPriority(Thread.MIN_PRIORITY);
            } else{
                thread.setPriority(Thread.MAX_PRIORITY);
            }
            thread.start();
        }
    }
}

class MyThread extends Thread{
    public void run(){
        for(int i=0;i<2000000000;i++){}
        System.out.println(getName());
    }
}
