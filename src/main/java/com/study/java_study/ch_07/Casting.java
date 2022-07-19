package com.study.java_study.ch_07;

public class Casting {
}

class Car {

    String color;
    int door;

    void drive() {
        System.out.println("Drive Start!");
    }

    void stop() {
        System.out.println("Stop!");
    }
}

// 소방차
class FireEngine extends Car {
    void water() {
        System.out.println("Water!");
    }
}

// 구급차
class Ambulance extends Car {


    public static void main(String[] args) {


        // 자손타입 -> 조상타입 형변환 예시
        Car car = new Car();

        Car car2 = null;

        Ambulance ambulance = new Ambulance();

        Ambulance ambulance2 = null;


        //조상타입 -> 자손타입 형변환 생략시 컴파일 에러 발생
        //ambulance2 = car;

        car2 = ambulance;



        // car2의 인스턴스의 타입은 Ambulance지만 참조변수 타입은 Car이다
        // 그렇기 때문에 Car에 있는 멤버들만 사용이 가능하다
        car2.drive();;
        // water() 함수는 Ambulance 클래스에 속해 있는 메서드이기 때문에 컴파일 에러가 발생한다.
        //car2.water();

    }





}
