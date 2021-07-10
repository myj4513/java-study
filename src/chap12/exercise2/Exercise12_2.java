package chap12.exercise2;

import java.util.*;

public class Exercise12_2 {
}

class Fruit{}
class Apple extends Fruit{}
class Grape extends Fruit{}

class Box<T>{
    List<T> list = new ArrayList<T>();
    List<T> getList(){return list;}
    void add(T item){list.add(item);}
    T get(int i){return list.get(i);}
}

class FruitBox<T extends Fruit> extends Box<T>{}

class Juicer{
    static <T extends Fruit> String makeJuice(FruitBox<T> box){
        String tmp = "";
        for(Fruit f : box.getList())
            tmp += f + " ";
        return tmp;
    }
}