package chap11.exercise7;

import java.util.*;

public class Exercise11_7 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student("홍길동", 5,1,100,100,100));
        list.add(new Student("남궁성", 1,1,90,70,80));
        list.add(new Student("김자바", 3,3,80,80,90));
        list.add(new Student("이자바", 1,2,70,90,70));
        list.add(new Student("안자바", 4,5,60,100,80));

        Collections.sort(list, new BanNoAscending());
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

class BanNoAscending implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Student && o2 instanceof Student){
            Student s1 = (Student)o1;
            Student s2 = (Student)o2;
            if(s1.ban==s2.ban){
                return s1.no - s2.no;
            }
            return s1.ban - s2.ban;
        }
        return -1;
    }
}

class Student{
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
}


