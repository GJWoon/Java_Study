package com.study.java_study.ch_07;

public class Inheritance {

}

class Parent {
    int age;
}


// Child 클래스는 Parent 클래스를 상속 받으며

// Child 클래스도 Parent 클래스에 있는 age라는 멤버를 갖게된다.
class Child extends Parent {
    void play() {
        age = 1;
    }
}

// 컴파일 에러 발생 - 자바는 다중상속을 허용하지 않는다.
//class TVCR extends Parent,Child {
//}