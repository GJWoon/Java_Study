package com.study.java_study.ch_06;


class Data {
    int a = 1;
}

public class PrimitiveParamEx {

    // 기본형 매개변수

    public static void main(String[] args) {
        Data d = new Data();

        System.out.println("main a = " + d.a);

        changeInt(d.a);

        System.out.println("changeInt After a = " + d.a);

        System.out.println(d.a);
    }
    static void changeInt(int d) {

        d = 2;
        System.out.println("changeInt" + d);

    }

}
