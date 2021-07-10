package chap11.exercise6;

import java.util.*;

public class Exercise11_6 {
    public static int getGroupCount(TreeSet tSet, int from, int to){
        Student s1 = new Student("",0,0,from,from,from);
        Student s2 = new Student("", 0,0,to,to,to);
        return tSet.subSet(s1,s2).size();
    }
    public static void main(String[] args) {
        TreeSet set = new TreeSet(new Comparator(){
            public int compare(Object o1, Object o2){
                if(o1 instanceof Student && o2 instanceof Student){
                    Student s1 = (Student)o1;
                    Student s2 = (Student)o2;
                    return (int)(s1.getAverage() - s2.getAverage());
                }
                return -1;
            }
        });
        set.add(new Student("홍길동", 1,1,100,100,82));
        set.add(new Student("남궁성", 1,2,100,100,85));
        set.add(new Student("김자바", 1,3,100,100,88));
        set.add(new Student("이자바", 1,4,100,100,91));
        set.add(new Student("안자바", 1,5,100,100,94));
        set.add(new Student("황자바", 1,6,100,100,97));
        set.add(new Student("문자바", 1,7,100,100,100));
        System.out.println();
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("[60~69] : "+getGroupCount(set, 60,70));
        System.out.println("[70~79] : "+getGroupCount(set, 70,80));
        System.out.println("[80~89] : "+getGroupCount(set, 80,90));
        System.out.println("[90~100] : "+getGroupCount(set, 90,101));
    }
}

class Student implements Comparable{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal(){
        return kor + eng + math;
    }

    float getAverage(){
        return getTotal()/3.0f;
    }

    public String toString(){
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," +getAverage();
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Student){
            Student tmp = (Student)o;
            return name.compareTo(tmp.name);
        }
        return -1;
    }
}


