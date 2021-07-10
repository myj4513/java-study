package chap12.exercise5;

public class Exercise12_5 {
    public static void main(String[] args) {
        Deck d = new Deck();
        Card c = d.pick(0);
        System.out.println(c);

        d.shuffle();
        c = d.pick(0);
        System.out.println(c);
    }
}

class Deck{
    final int CARD_NUM = Card.Kind.values().length * Card.Number.values().length;
    Card cardArr[] = new Card[CARD_NUM];
    Deck(){
        int i=0;
        for(Card.Kind k : Card.Kind.values()){
            for(Card.Number n : Card.Number.values()){
                cardArr[i++] = new Card(k,n);
            }
        }
    }

    Card pick(int index){
        return cardArr[index];
    }

    Card pick(){
        int index = (int)(Math.random()*CARD_NUM);
        return cardArr[index];
    }

    void shuffle(){
        for(int i=0;i<CARD_NUM;i++){
            int j = (int)(Math.random()*CARD_NUM);
            Card tmp = cardArr[i];
            cardArr[i] = cardArr[j];
            cardArr[j] = tmp;
        }
    }
}

class Card{
    enum Kind {CLOVER, HEART, DIAMOND, SPADE}
    enum Number{
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    Kind kind;
    Number num;

    Card(){
        this(Kind.SPADE, Number.ACE);
    }

    Card(Kind kind, Number num){
        this.kind = kind;
        this.num = num;
    }

    public String toString(){
        return "["+kind.name()+","+num.name()+"]";
    }
}
