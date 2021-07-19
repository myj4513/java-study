package chap14.practice14;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class StreamEx6 {
    public static void main(String[] args) {
        Student[] stuArr = {
                new Student("이자바", 3, 300),
                new Student("김자바", 1, 200),
                new Student("안자바", 2, 100),
                new Student("박자바", 2, 150),
                new Student("소자바", 1, 200),
                new Student("나자바", 3, 290),
                new Student("감자바", 3, 180),
        };

        List<String> names = Stream.of(stuArr).map(Student::getName).collect(Collectors.toList());
        System.out.println(names);

        Student[] students = Stream.of(stuArr).toArray(Student[]::new);
        for(Student s : students){
            System.out.println(s);
        }

        Map<String, Student> stuMap = Stream.of(stuArr).collect(Collectors.toMap(p->p.getName(),p->p));
        for(String name : stuMap.keySet()){
            System.out.println(name+"-"+stuMap.get(name));
        }

        long count = Stream.of(stuArr).collect(counting());
        System.out.println("count="+count);
        long totalScore = Stream.of(stuArr).collect(Collectors.summingInt(Student::getTotalScore));
        System.out.println("totalScore="+totalScore);
        long totalScore2 = Stream.of(stuArr).mapToInt(Student::getTotalScore).reduce(0,(a,b)->a+b);
        System.out.println("totalScore2="+totalScore2);
        long totalScore3 = Stream.of(stuArr).collect(Collectors.reducing(0, (Student::getTotalScore), Integer::sum));
        System.out.println("totalScore3="+totalScore3);

        Optional<Student> topStudent = Stream.of(stuArr).collect(Collectors.maxBy(Comparator.comparingInt(Student::getTotalScore)));
        System.out.println("topStudent="+topStudent);

        IntSummaryStatistics stat = Stream.of(stuArr).collect(summarizingInt(Student::getTotalScore));
        System.out.println(stat);

        String stuNames = Stream.of(stuArr).map(Student::getName).collect(Collectors.joining(",","{","}"));
        System.out.println("stuNames="+stuNames);
    }
}

class Student implements Comparable<Student>{
    String name;
    int ban;
    int totalScore;

    Student(String name, int ban, int totalScore){
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public String toString(){
        return String.format("[%s, %d, %d]", name, ban, totalScore).toString();
    }

    String getName(){return name;}
    int getBan(){return ban;}
    int getTotalScore(){return totalScore;}

    public int compareTo(Student s){
        return s.totalScore - this.totalScore;
    }
}
