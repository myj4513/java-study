package chap14.exercise6;

import java.util.OptionalInt;
import java.util.stream.Stream;

public class Exercise14_6 {
    public static void main(String[] args) {
        String[] strArr = {"aaa", "bb", "c", "dddd"};

        OptionalInt length = Stream.of(strArr).mapToInt(s->s.length()).max();
        System.out.println(length.getAsInt());
    }
}
