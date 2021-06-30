package chap11.practice33;

public class TestStringHashCode {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
    }
}
