package chap14.test2;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest2 {
    public static void main(String[] args) {
        IntStream intStream = new Random().ints(5,10);
        intStream.limit(10).distinct().sorted().forEach(System.out::print);

        Stream<Integer> intStream2 = Stream.iterate(0, x->x+2);
        intStream2.limit(100).forEach(System.out::println);

        Stream<Integer> oneStream = Stream.generate(()->1);
        oneStream.limit(10).forEach(System.out::println);
    }
}
