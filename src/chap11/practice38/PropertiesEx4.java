package chap11.practice38;

import java.util.*;

public class PropertiesEx4 {
    public static void main(String[] args) {
        Properties sysProp = System.getProperties();
        System.out.println("java.version : "+sysProp.getProperty("java.version"));
        System.out.println("user.language : "+sysProp.getProperty("user.language"));
        System.out.println(sysProp.getProperty("java.class.path"));
        sysProp.list(System.out);

    }
}
