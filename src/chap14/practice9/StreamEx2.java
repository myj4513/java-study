package chap14.practice9;

import java.io.*;
import java.util.stream.*;

public class StreamEx2 {
    public static void main(String[] args) {
        File[] fileArr = {
                new File("Ex1.java"),
                new File("Ex1.bak"),
                new File("Ex2.java"),
                new File("Ex1"),
                new File("Ex1.txt")
        };

        Stream<File> fileStream = Stream.of(fileArr);
        Stream<String> fileNameStream = fileStream.map(File::getName);

        fileNameStream.filter(s->s.indexOf(".")!=-1)
                .peek(s->System.out.printf("fileName = %s\n",s))
                .map(s->s.substring(s.indexOf(".")+1))
                .map(String::toUpperCase)
                .distinct().forEach(System.out::println);
    }
}
