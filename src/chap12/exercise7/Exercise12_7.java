package chap12.exercise7;

public class Exercise12_7 {
}

@interface TestInfo{
    int count() default 1;
    String[] value() default "aaa";
}