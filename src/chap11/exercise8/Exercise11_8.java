package chap11.exercise8;

import java.util.*;

public class Exercise11_8 {
    public static void calculateSchoolRank(List list){
        Collections.sort(list);

        int preRank = -1;
        int preTotal = -1;
        int length = list.size();

        for(int i=0;i<list.size();i++){
            Student s = (Student)list.get(i);
            if(s.total == preTotal){
                s.schoolRank = preRank;
            } else{
                s.schoolRank = i + 1;
            }
            preRank = s.schoolRank;
            preTotal = s.total;
        }
    }
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student("이자바", 2,1,70,90,70));
        list.add(new Student("안자바", 2,2,60,100,80));
        list.add(new Student("홍길동", 1,3,100,100,100));
        list.add(new Student("남궁성", 1,1,90,70,80));
        list.add(new Student("김자바", 1,2,80,80,90));

        calculateSchoolRank(list);
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

class Student implements Comparable{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int total;
    int schoolRank;

    Student(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.total = kor+eng+math;
    }

    int getTotal(){
        return total;
    }

    float getAverage(){
        return getTotal()/3.0f;
    }

    public String toString(){
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," +getAverage()+","+schoolRank;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Student){
            Student tmp = (Student)o;
            return tmp.total - total;
        }
        return -1;
    }
}