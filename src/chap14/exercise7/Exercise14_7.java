package chap14.exercise7;

import java.util.Random;
import java.util.stream.*;

public class Exercise14_7 {
    public static void main(String[] args) {
        //new Random().ints(1,46).distinct().limit(6).sorted().forEach(System.out::println);
        IntStream lotto = new Random().ints(1,46).distinct().limit(6).sorted();
        lotto.forEach(System.out::println);
    }
}
