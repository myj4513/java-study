package chap12.exercise1;

public class Exercise12_1 {
    public static void main(String[] args) {
        //new Box<String>().setItem(new Object());
    }
}

class Box<T>{
    T item;

    void setItem(T item){ this.item = item;}
    T getItem() {return item;}
}
/*
a. Box<Object> b = new Box<String>();
b. Box<Object> b = (Object)new Box<String>();
c. new Box<String>.setItem(new Object());
d. new Box<String>().setItem("ABC");
 */