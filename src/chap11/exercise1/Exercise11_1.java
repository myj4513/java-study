package chap11.exercise1;

import java.util.*;

public class Exercise11_1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        ArrayList kyo = new ArrayList();
        ArrayList hab = new ArrayList();
        ArrayList cha = new ArrayList();

        for(int i=0;i<4;i++){
            list1.add(i+1);
            list2.add(i+3);
        }

        hab.addAll(list1);
        hab.addAll(list2);

        cha.addAll(list1);
        cha.removeAll(list2);

        kyo.addAll(list1);
        kyo.retainAll(list2);

        System.out.println("list1="+list1);
        System.out.println("list2="+list2);
        System.out.println("kyo="+kyo);
        System.out.println("cha="+cha);
        System.out.println("hab="+hab);
    }
}
