package com.study.java_study.ch_07;

public class Interface {
}


interface PlayingCard {

    public static final int DIAMOND = 3;

    int HEART = 2;

    public abstract int getDiamond();

    int getHeart();

}

class Card implements PlayingCard {

    @Override
    public int getDiamond() {
        return 0;
    }

    @Override
    public int getHeart() {
        return 0;
    }


}


abstract class Unit {
    int x, y;

    abstract void move(int x, int y);

    void stop() {
        System.out.println("멈춘다");
    }
}

interface Fightable {
    void move(int x, int y);

    void attack(Fightable f);
}

class Fighter extends Unit implements Fightable {

    @Override
    public void move(int x, int y) {
        System.out.println(x + "로 이동");
        System.out.println(y + "로 이동");

    }

    @Override
    public void attack(Fightable f) {
        System.out.println(f + "를 공격한다.");
    }

    // Fighter 클래스가 Fightable을 구현히였기 때문에 아래의 메서드 반환타입이 성립된다.
    Fightable getFightable(){
        return new Fighter();
    }
}

class FighterTest {
    public static void main(String[] args) {
        Fighter f2 = new Fighter();
        // Fightable f = new Fighter();
        Unit f = new Fighter();
        f.stop();
        f.move(100, 200);
        //f.attack(f);
        Fightable fightable = f2.getFightable();
    }

}
// 인터페이스의 조상은 인터페이스만 가능

//interface ExtendsTest extends Object {
//
//}

