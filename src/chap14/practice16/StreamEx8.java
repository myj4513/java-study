package chap14.practice16;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.stream.Collector.*;
import java.util.Comparator.*;

public class StreamEx8 {
    public static void main(String[] args) {
        Student[] students = {
                new Student("나자바", true, 1, 1, 300),
                new Student("김지미", false, 1, 1, 250),
                new Student("김자바", true, 1, 1, 200),
                new Student("이지미", false, 1, 2, 150),
                new Student("남자바", true, 1, 2, 100),
                new Student("안지미", false, 1, 2, 50),
                new Student("황지미", false, 1, 3, 100),
                new Student("강지미", false, 1, 3, 150),
                new Student("이자바", true, 1, 3, 200),

                new Student("나자바", true, 2, 1, 300),
                new Student("김지미", false, 2, 1, 250),
                new Student("김자바", true, 2, 1, 200),
                new Student("이지미", false, 2, 2, 150),
                new Student("남자바", true, 2, 2, 100),
                new Student("안지미", false, 2, 2, 50),
                new Student("황지미", false, 2, 3, 100),
                new Student("강지미", false, 2, 3, 150),
                new Student("이자바", true, 2, 3, 200),
        };

        System.out.println("1. 단순그룹화(반별로 그룹화)");
        Map<Integer, List<Student>> stuByBan = Stream.of(students).collect(Collectors.groupingBy(Student::getBan));
        List<Student> ban1 = stuByBan.get(1);
        List<Student> ban2 = stuByBan.get(2);
        List<Student> ban3 = stuByBan.get(3);
        for (Student s : ban1) {
            System.out.println(s);
        }
        for (Student s : ban2) {
            System.out.println(s);
        }
        for (Student s : ban3) {
            System.out.println(s);
        }

        System.out.println("\n2. 단순그룹화(성적별로 그룹화)");
        Map<Student.Level, List<Student>> stuByLevel = Stream.of(students).collect(Collectors.groupingBy(s -> {
            if (s.getScore() >= 200) return Student.Level.HIGH;
            else if (s.getScore() >= 100) return Student.Level.MID;
            else return Student.Level.LOW;
        }));
        TreeSet<Student.Level> keySet = new TreeSet<Student.Level>(stuByLevel.keySet());
        for(Student.Level l : keySet){
            System.out.println("["+l+"]");
            for(Student s : stuByLevel.get(l)){
                System.out.println(s);
            }
            System.out.println();
        }
        System.out.println("\n3. 단순그룹화 + 통계(성적별 학생수)");
        Map<Student.Level, Long> stuCntByLevel = Stream.of(students).collect(Collectors.groupingBy(s->{
            if(s.getScore()>=200) return Student.Level.HIGH;
            else if(s.getScore()>=100) return Student.Level.MID;
            else return Student.Level.LOW;
        }, Collectors.counting()));

        for(Student.Level key : stuCntByLevel.keySet()){
            System.out.println("["+key+"] : "+stuCntByLevel.get(key)+"명");
        }

        System.out.println("\n4. 다중그룹화(학년별, 반별)");
        Map<Integer, Map<Integer, List<Student>>> stuByHakBan = Stream.of(students).collect(Collectors.groupingBy(Student::getHak, Collectors.groupingBy(Student::getBan)));
        for(Map<Integer, List<Student>> hak : stuByHakBan.values()){
            for(List<Student> ban : hak.values()){
                System.out.println();
                for(Student s : ban){
                    System.out.println(s);
                }
            }
        }
        System.out.println("\n5. 다중그룹화 + 통계(학년별, 반별 1등)");
        Map<Integer, Map<Integer, Student>> topStuHakBan = Stream.of(students).collect(Collectors.groupingBy(Student::getHak, Collectors.groupingBy(Student::getBan, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Student::getScore)), Optional::get))));
        for(Map<Integer, Student> ban : topStuHakBan.values()){
            for(Student s : ban.values()){
                System.out.println(s);
            }
        }
        System.out.println("\n6. 다중그룹화 + 통계(학년별, 반별 성적그룹)");
        /*
        Map<Integer, Map<Integer, Set<Student.Level>>> a = Stream.of(students)
                .collect(Collectors.groupingBy(Student::getHak, Collectors.groupingBy(Student::getBan, Collectors.mapping(s->{
            if(s.getScore()>=200){return Student.Level.HIGH;}
            else if(s.getScore()>=100) return Student.Level.MID;
            else return Student.Level.LOW;
        }, Collectors.toSet()))));

        for(Integer key : a.keySet()){
            for(Integer key2 : a.get(key).keySet()){
                System.out.println("["+key+"학년 "+key2+"반]"+a.get(key).get(key2));
            }
        }
         */
        Map<String, Set<Student.Level>> stuByScoreGroup = Stream.of(students).collect(Collectors.groupingBy(s -> s.getHak() + "-" + s.getBan(),
                Collectors.mapping(s->{
                    if(s.getScore()>=200) return Student.Level.HIGH;
                    else if(s.getScore()>=100) return Student.Level.MID;
                    else return Student.Level.LOW;
                    }, Collectors.toSet())
        ));

        Set<String> keySet2 = stuByScoreGroup.keySet();
        for(String key:keySet2){
            System.out.println("["+key+"]" + stuByScoreGroup.get(key));
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

    enum Level {HIGH, MID, LOW}

    @Override
    public int compareTo(Student s){
        return s.score - this.score;
    }
}
