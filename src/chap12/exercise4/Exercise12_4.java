package chap12.exercise4;

import java.util.*;

public class Exercise12_4 {
}

class Product{}

class Box{
    public static<T extends Product> ArrayList<T> merge(ArrayList<T> list1, ArrayList<T> list2){
        ArrayList<T> newList = new ArrayList<>(list1);
        newList.addAll(list2);
        return newList;
    }
}

