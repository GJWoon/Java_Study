package com.study.java_study.ch_07;

public class Polymorphism {

    Tv tv = new Tv();
    CaptionTv captionTv = new CaptionTv();
    Tv cTv = new CaptionTv(); // 조상타입의 참조변수로 자손클래스를 참조


    public static void main(String[] args) {

        Tv cTv = new CaptionTv();

        cTv.power(); // 조상 클래스의 멤버를 사용 가능하다
        // cTv.caption(); // 컴파일 에러!!

        // 참조변수의 타입이 자손타입이며 조상클래스의 인스턴스를 생성하려하면 컴파일 에러가 발생한다.
        // CaptionTv tv = new Tv();
        // 참조변수의 타입이 조상클래스 타입이며 자손클래스 타입의 인스턴스를 생성한다
        // 컴파일 에러가 나지않는다
        // tv 참조 변수는 CaptionTv클래스의 멤버를 사용 할 수 없으며 Tv클래스의 멤버만 사용 가능하다.
        Tv tv = new CaptionTv();
    }
}

class Tv{
    boolean power;
     void power(){
        power = !power;
    }
}
class CaptionTv extends Tv{
     String text;
     void caption(){
    }
}