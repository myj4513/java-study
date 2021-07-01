package chap11.exercise12;

import java.util.*;

public class Exercise11_12 {
    public static void main(String[] args) {
        //StudaDeck
    }
}

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    int pos = 0;
    HashMap jokbo = new HashMap();

    SutdaDeck(){
        for(int i=0;i<cards.length;i++){
            int num = i%10+1;
            boolean isKwang = i<10 && (num==1||num==3||num==8);

            cards[i] = new SutdaCard(num, isKwang);
        }
        registerJokbo();
    }

    void registerJokbo(){

    }

    int getPoint(Player p){
        if(p==null) return 0;
        SutdaCard c1 = p.c1;
        SutdaCard c2 = p.c2;

        Integer result = 0;

        return result.intValue();
    }

    SutdaCard pick() throws Exception{
        SutdaCard c = null;

        if(0<=pos && pos<CARD_NUM){
            c = cards[pos];
            cards[pos++] = null;
        } else{
            throw new Exception("남아있는 카드가 없습니다.");
        }
        return c;
    }

    void shuffle(){
        for(int x=0;x<CARD_NUM;x++){
            int i = (int)(Math.random()*CARD_NUM);
            int j = (int)(Math.random()*CARD_NUM);
            SutdaCard tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;
        }
    }
}

class Player{
    String name;
    SutdaCard c1;
    SutdaCard c2;

    int point;

    Player(String name, SutdaCard c1, SutdaCard c2){
        this.name = name;
        this.c1 = c1;
        this.c2 = c2;
    }

    public String toString(){
        return "["+name+"]"+c1.toString()+","+c2.toString();
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

    public String toString(){
        return num + (isKwang?"K":"");
    }
}
