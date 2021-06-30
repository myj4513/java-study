package chap11.practice35;

import java.util.*;

public class PropertiesEx1 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.setProperty("timeout","30");
        prop.setProperty("language", "kr");
        prop.setProperty("size", "10");
        prop.setProperty("capacity", "10");

        Enumeration e = prop.propertyNames();

        while(e.hasMoreElements()){
            String element = (String)e.nextElement();
            System.out.println(element+"="+prop.getProperty(element));
        }
        System.out.println();

        prop.setProperty("size", "20");
        System.out.println("size="+prop.getProperty("size"));
        System.out.println("capacity="+prop.getProperty("capacity","200"));;
        System.out.println("loadFactor="+prop.getProperty("loadFactor","0.75"));
        System.out.println(prop);
        prop.list(System.out);

    }
}
