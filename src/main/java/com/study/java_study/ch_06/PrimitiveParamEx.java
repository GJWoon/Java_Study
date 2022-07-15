package com.study.java_study.ch_06;


class Data {
    int x = 1;
}

public class PrimitiveParamEx {

    // 기본형 매개변수

    public static void main(String[] args) {
        Data d = new Data();

        System.out.println("main x = " + d.x);

        changeInt(d.x);

        System.out.println("changeInt After x = " + d.x);

        System.out.println(d.x);
    }
    static void changeInt(int x) {

        x = 2;
        System.out.println("changeInt x = " + x);

    }

}
