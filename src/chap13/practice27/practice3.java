package chap13.practice27;

public class practice3 {
    public static void main(String[] args) {
        Runnable r1 = new MyThread3();
        Runnable r2 = new MyThread3();

        new Thread(r1).start();
        new Thread(r2).start();
    }
}

class Account{
    private int balance = 1000;

    public synchronized int getBalance(){
        return balance;
    }

    public synchronized void withdraw(int money){
        if(balance >= money) {
            balance -= money;
        }
    }
}

class MyThread3 implements Runnable{
    Account acc = new Account();

    public void run(){
        while(acc.getBalance()>0){
            int money = (int)(Math.random() * 3 + 1)*100;
            acc.withdraw(money);
            System.out.println("balance : "+ acc.getBalance());
        }
    }
}