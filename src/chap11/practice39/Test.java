package chap11.practice39;

import java.time.*;
import java.time.format.*;

public class Test {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH:mm:ss");
        System.out.println(ldt.format(formatter));

    }
}
