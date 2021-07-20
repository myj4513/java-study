package chap14.exercise5;

import java.util.stream.Stream;

public class Exercise14_5 {
    public static void main(String[] args) {
        String[] strArr = {"aaa", "bb", "c", "dddd"};

        int sum = Stream.of(strArr).mapToInt(s->s.length()).sum();
        System.out.println("sum="+sum);
    }
}
