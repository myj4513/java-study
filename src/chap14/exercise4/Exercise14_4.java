package chap14.exercise4;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise14_4 {
    public static void main(String[] args) {
        Stream<Integer> die = IntStream.range(1,7).boxed();
        die.flatMap(i->Stream.of(1,2,3,4,5,6).map(i2->new int[]{i,i2})).forEach(iArr-> System.out.println(Arrays.toString(iArr)));
    }
}
