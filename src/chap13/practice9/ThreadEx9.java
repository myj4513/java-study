package chap13.practice9;

public class ThreadEx9 {
    public static void main(String[] args) {
        ThreadGroup main = Thread.currentThread().getThreadGroup();
        ThreadGroup grp1 = new ThreadGroup("Group1");
        ThreadGroup grp2 = new ThreadGroup("Group2");

        ThreadGroup subGrp1 = new ThreadGroup(grp1, "SubGroup1");

        grp1.setMaxPriority(3);

        Runnable r = new Runnable(){
            public void run(){
                try{
                    Thread.sleep(1000);
                } catch(InterruptedException e){

                }
            }
        };

        new Thread(grp1, r, "th1").start();
        new Thread(subGrp1, r, "th2").start();
        new Thread(grp2, r, "th3").start();
        new Thread(r, "th4").start();
        System.out.println(">>List of ThreadGroup : "+main.getName()+", ActiveThreadGroup : "+main.activeGroupCount()+", main.activeCount : "+main.activeCount());
        main.list();
    }
}