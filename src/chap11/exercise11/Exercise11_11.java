package chap11.exercise11;

import java.util.*;

public class Exercise11_11 {
    public static void main(String[] args) {
        SutdaCard c1 = new SutdaCard(3,true);
        SutdaCard c2 = new SutdaCard(3,true);
        SutdaCard c3 = new SutdaCard();
        HashSet set = new HashSet();
        set.add(c1);
        set.add(c2);
        set.add(c3);

        System.out.println(set);
    }
}

class SutdaCard{
    int num;
    boolean isKwang;

    SutdaCard(){
        this(1,true);
    }

    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    public boolean equals(Object obj){
        if(obj instanceof SutdaCard){
            SutdaCard c = (SutdaCard)obj;
            return num==c.num && isKwang == c.isKwang;
        }
        return false;
    }

    public int hashCode(){
        return toString().hashCode();
    }

    public String toString(){
        return num +(isKwang?"K":"");
    }
}