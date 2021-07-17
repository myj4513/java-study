package chap14.practice4;

import java.util.*;

public class LambdaEx4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            list.add(i);
        }

        list.forEach((i)-> System.out.print(i+", "));
        System.out.println();

        list.removeIf((i)->i%2==0 || i%3==0);
        System.out.println(list);

        list.replaceAll(i->i*10);
        System.out.println(list);

        Map<String, String> map = new HashMap<String, String>();
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        map.put("4","4");

        map.forEach((a,b)-> System.out.println(a+b));
    }
}
