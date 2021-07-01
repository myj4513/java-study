package chap11.practice34;

import java.util.*;

public class TreeMapEx1 {
    public static void main(String[] args) {
        String[] data = {"A","K","A","K","D","K","A","K","K","K","Z","D"};

        TreeMap map = new TreeMap();

        for(int i=0;i<data.length;i++){
            if(map.containsKey(data[i])){
                int num = Integer.parseInt((String)map.get(data[i]));
                map.put(data[i], num+1+"");
            }else{
                map.put(data[i], 1+"");
            }
        }

        Iterator it = map.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            int value = Integer.valueOf(entry.getValue().toString());
            System.out.println(entry.getKey()+":"+printBar('#',value)+" "+value);
        }
        System.out.println();

        Set set = map.entrySet();
        List list = new LinkedList(set);
        Collections.sort(list, new ValueComparator());
        it = list.iterator();
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            int num = Integer.parseInt(entry.getValue().toString());
            System.out.println(entry.getKey()+":"+printBar('@',num)+" "+num);
        }
    }

    public static String printBar(char ch, int value){
        String tmp = "";
        for(int i=0;i<value;i++){
            tmp +=ch;
        }
        return tmp;
    }
}
class ValueComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
            Map.Entry e1 = (Map.Entry) o1;
            Map.Entry e2 = (Map.Entry) o2;
            int v1 = Integer.parseInt(e1.getValue().toString());
            int v2 = Integer.parseInt(e2.getValue().toString());
            return v2 - v1;
        }
        return -1;
    }
}
