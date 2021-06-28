package chap7.exercise15;

public class Exercise7_15 {

    public static void main(String[] args) {
        Unit u = new GroundUnit();
        Tank t = new Tank();
        AirCraft ac = new AirCraft();
    }
}
class Unit{}
class AirUnit extends Unit{}
class GroundUnit extends Unit{}
class Tank extends GroundUnit{}
class AirCraft extends AirUnit{}

