package chap14.practice15;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.stream.Collectors.*;
import java.util.Comparator.*;

public class StreamEx7 {
    public static void main(String[] args) {
        Student[] students = {
                new Student("나자바", true, 1,1,300),
                new Student("김지미", false, 1,1,250),
                new Student("김자바", true, 1,1,200),
                new Student("이지미", false, 1,2,150),
                new Student("남자바", true, 1,2,100),
                new Student("안지미", false, 1,2,50),
                new Student("황지미", false, 1,3,100),
                new Student("강지미", false, 1,3,150),
                new Student("이자바", true, 1,3,200),

                new Student("나자바", true, 2,1,300),
                new Student("김지미", false, 2,1,250),
                new Student("김자바", true, 2,1,200),
                new Student("이지미", false, 2,2,150),
                new Student("남자바", true, 2,2,100),
                new Student("안지미", false, 2,2,50),
                new Student("황지미", false, 2,3,100),
                new Student("강지미", false, 2,3,150),
                new Student("이자바", true, 2,3,200),
        };

        System.out.println("1. 단순분할(성별로 분할)");
        Map<Boolean, List<Student>> stuBySex = Stream.of(students).collect(Collectors.partitioningBy(Student::isMale));
        List<Student> maleStudent = stuBySex.get(true);
        List<Student> femaleStudent = stuBySex.get(false);
        for(Student s : maleStudent){ System.out.println(s); }
        for(Student s : femaleStudent){ System.out.println(s); }

        System.out.println("\n2. 단순분할 + 통계(성별 학생수)");
        Map<Boolean, Long> stuNumBySex = Stream.of(students).collect(Collectors.partitioningBy(Student::isMale, Collectors.counting()));
        System.out.println("남학생 수 : "+stuNumBySex.get(true)+"명");
        System.out.println("여학생 수 : "+stuNumBySex.get(false)+"명");

        System.out.println("\n3. 단순분할 + 통계(성별 1등)");
        Map<Boolean, Student> topScoreBySex = Stream
                .of(students)
                .collect(Collectors.partitioningBy(Student::isMale,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Student::getScore)), Optional::get)));
        System.out.println("남학생 1등 : "+topScoreBySex.get(true));
        System.out.println("여학생 1등 : "+topScoreBySex.get(false));

        Map<Boolean, Optional<Student>> topScoreBySex2 = Stream.of(students).collect(Collectors.partitioningBy(Student::isMale, Collectors.maxBy(Comparator.comparingInt(Student::getScore))));
        System.out.println("남학생 1등 : "+topScoreBySex2.get(true));
        System.out.println("여학생 1등 : "+topScoreBySex2.get(false));

        System.out.println("\n4. 다중분할 (성별 불합격자, 100점 이하)");
        Map<Boolean, Map<Boolean, List<Student>>> failedStuBySex = Stream.of(students).collect(Collectors.partitioningBy(Student::isMale, Collectors.partitioningBy(p->p.getScore()<=100)));
        List<Student> failedMaleStu = failedStuBySex.get(true).get(true);
        List<Student> failedFemaleStu = failedStuBySex.get(false).get(true);
        for(Student s : failedMaleStu){
            System.out.println(s);
        }
        for(Student s : failedFemaleStu){
            System.out.println(s);
        }
    }
}

class Student implements Comparable<Student>{
    String name;
    boolean isMale;
    int hak;
    int ban;
    int score;

    Student(String name, boolean isMale, int hak, int ban, int score){
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }

    public String toString(){
        return String.format("[%s, %s, %d학년 %d반, %3d점]", name, (isMale?"남":"여"), hak, ban, score);
    }

    String getName(){
        return name;
    }

    boolean isMale(){return isMale;}
    int getHak(){return hak;}
    int getBan(){return ban;}
    int getScore(){return score;}

    enum Level{HIGH, MID, LOW}

    @Override
    public int compareTo(Student s){
        return s.score - this.score;
    }
}
