package chap13.practice27;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Table table = new Table();
        new Thread(new Cook(table), "COOK1").start();
        new Thread(new Customer(table, "pizza"), "CUSTOMER1").start();
        new Thread(new Customer(table, "burger"), "CUSTOMER2").start();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){}
        System.out.println("프로그램 종료");
    }
}

class Table{
    private ArrayList<String> dishes = new ArrayList<String>();
    final int MAX_DISH = 6;
    String[] menu = {"pizza", "burger", "pizza"};

    public synchronized void add(String dishName){
        while(dishes.size()>=MAX_DISH){
            try{
                wait();
            } catch(InterruptedException e){}
        }
        dishes.add(dishName);
        notify();
        System.out.println("Dishes : "+dishes.toString());
    }

    public void remove(String dishName){
        synchronized(this){
            while(dishes.size() == 0){
                System.out.println(Thread.currentThread().getName()+" is waiting");
                try{
                    wait();
                    Thread.sleep(1000);
                } catch(InterruptedException e){}

            }
            while(true){
                for(int i=0;i<dishes.size();i++){
                    if(dishName.equals(dishes.get(i))){
                        dishes.remove(dishName);
                        notify();
                        return;
                    }
                }
                try{
                    System.out.println(Thread.currentThread().getName() + " is waiting");
                    wait();
                } catch(InterruptedException e){}
            }
        }
    }
}

class Customer implements Runnable{
    private Table table;
    private String food;

    Customer(Table table, String food){
        this.table = table;
        this.food = food;
    }

    public void run(){
        while(true){
            try{
                Thread.sleep(100);
            } catch(InterruptedException e){}
            String name = Thread.currentThread().getName();
            table.remove(food);
            System.out.println(name + " ate a "+food);
        }
    }
}

class Cook implements Runnable{
    private Table table;

    Cook(Table table){
        this.table = table;
    }

    public void run(){
        while(true){
            int idx = (int)(Math.random() * table.menu.length);
            table.add(table.menu[idx]);
            try{
                Thread.sleep(500);
            } catch(InterruptedException e){}
        }
    }
}