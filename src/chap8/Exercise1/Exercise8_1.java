package chap8.Exercise1;

public class Exercise8_1 {
    void add(int a, int b) throws InvalidNumberException, NotANumberException {}
}



class NumberException extends Exception{}
class InvalidNumberException extends NumberException {}
class NotANumberException extends NumberException {}
