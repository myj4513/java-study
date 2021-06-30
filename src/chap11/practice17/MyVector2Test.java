package chap11.practice17;

import chap11.practice16.MyVector2;
import java.util.*;
import chap11.practice4.MyVector;

public class MyVector2Test {
    public static void main(String[] args) {
        MyVector2 v = new MyVector2();
        for(int i=0;i<5;i++){
            v.add(i+"");
        }
        System.out.println("삭제전:"+v);
        Iterator it = v.iterator();
        it.next();
        it.remove();
        it.next();
        it.remove();

        System.out.println("삭제후:"+v);

    }
}
