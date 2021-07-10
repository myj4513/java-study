package chap12.exercise3;

public class Exercise12_3 {
}

class Fruit{}

class Box<T extends Fruit>{
    T item;

    void setItem(T item){
        this.item = item;
    }
    T getItem(){return item;}
}