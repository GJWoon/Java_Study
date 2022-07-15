package com.study.java_study.ch_06;


public class ReferenceParamEx {

    public static void main(String[] args) {

        Data data = new Data();

        System.out.println("main x = " + data.x);

        change(data);

        System.out.println(data.x);
    }

    static void change(Data d){
        d.x = 2;
        System.out.println("change x =" + d.x);
    }
}
