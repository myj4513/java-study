package chap13.practice27;

public class practice2 {
    public static void main(String[] args) {
        MyThread2 gc = new MyThread2();
        gc.setDaemon(true);
        gc.start();
        for(int i=0;i<20;i++){
            int mem = (int)(Math.random()*10)*20;
            gc.usedMemory += mem;
            if(gc.freeMemory()<mem || gc.freeMemory()<gc.MAX_MEMORY*0.4){
                gc.interrupt();
                try{
                    gc.join(1000);
                }catch(InterruptedException e){}
            }
            System.out.println("Used Memory : "+gc.usedMemory);
        }
    }
}

class MyThread2 extends Thread{
    final static int MAX_MEMORY = 1000;
    int usedMemory = 0;

    public void run(){
        while(true){
            try{
                Thread.sleep(10 * 1000);
            } catch (InterruptedException e){}
            gc();
            System.out.println("Garbage Collected. Free Memory : " + freeMemory());
        }
    }

    public int freeMemory(){
        return MAX_MEMORY - usedMemory;
    }

    public void gc(){
        usedMemory -= 300;
        if(usedMemory < 0){
            usedMemory = 0;
        }
    }
}
