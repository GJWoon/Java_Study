package com.study.java_study.ch_06;

public class StaticMethod {

    public int x = 0;

    public static int staticX =0;

    // static 메서드에서 static 변수를 사용하였기 때문에 에러가 나지 않는다.
    public static void changeXStaticMethod(int a){
        staticX = a;
    }
    // 인스턴스 메서드는 인스턴스 변수를 사용 할 수 있기 때문에 오류가 나지 않는다.
    public void changeX(int a){
        x = 1;
    }
}
class StaticMethodTest{

    public static void main(String[] args) {

        int x = 2;
        //에러!!
        //StaticMethod.changeX(1);
        // static 메서드 사용방법
        StaticMethod.changeXStaticMethod(2);

        System.out.println(StaticMethod.staticX);
        // 인스턴스 메서드 사용방법
        StaticMethod staticMethod = new StaticMethod();

        staticMethod.changeX(2);

        System.out.println(staticMethod.x);

    }
}
