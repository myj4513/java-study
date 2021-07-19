package chap14.practice13;

import java.util.*;
import java.util.stream.*;

public class StreamEx5 {
    public static void main(String[] args) {
        String[] strArr = {
                "Inheritance", "Java", "Lambda", "stream",
                "OptionalDouble", "IntStream", "count", "sum"
        };

        Stream.of(strArr).forEach(System.out::println);

        boolean noEmptyStr = Stream.of(strArr).noneMatch(x->x.length()==0);
        System.out.println("noEmptyStr="+noEmptyStr);
        Optional<String> sWord = Stream.of(strArr).parallel().filter(x->x.charAt(0)=='s').findAny();
        System.out.println("sWord="+sWord.get());

        OptionalInt max = Stream.of(strArr).mapToInt(x->x.length()).reduce(Integer::max);
        Optional min = Stream.of(strArr).map(x->x.length()).reduce(Integer::min);
        System.out.println("max="+max.getAsInt());
        System.out.println("min="+min.get());
        int count = Stream.of(strArr).mapToInt(x->x.length()).reduce(0, (a,b)->a+1);
        System.out.println("count="+count);
        int sum = Stream.of(strArr).mapToInt(x->x.length()).reduce(0,(a,b)->a+b);
        Stream<Integer> intStream = Stream.of(strArr).map(x->x.length());
        int sum2 = intStream.reduce(0, (a,b)->a+b);
        System.out.println(sum2);
        System.out.println("sum="+sum);
    }
}
