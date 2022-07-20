package com.study.java_study.ch_07;

public class Abstract {
    AudioPlay audioPlay = new AudioPlay();
}


abstract class Player{ // 추상클래스 (미완성 클래스)
    abstract void play(int pos);  // 추상메서드 (구현부가 없는 미완성 메서드)
    abstract void stop(); // 추상메서
    // 추상메서드는 구현부가 없는대신 abstact라는 키워드를 붙인다.
    // 추상클래스의 인스턴스는 생성이 불가하다.
    // Player player = new Player();    컴파일 에러 발생!
}

class AudioPlay extends Player{

    void play(int pos) {

    } // 추상메서드를 구현
    void stop() {

    } // 추상메서드를 구현
}