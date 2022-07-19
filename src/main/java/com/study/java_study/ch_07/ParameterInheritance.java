package com.study.java_study.ch_07;

public class ParameterInheritance {

    int money = 10000;
    int point = 0;

    void buy(Phone t){
        money -= t.price;
        point += t.bonusPoint;
    }
    void buy(Monitor m){
        money -= m.price;
        point += m.bonusPoint;
    } void buy(Mouse mo){
        money -= mo.price;
        point += mo.bonusPoint;
    }
}

class Product{
    int price;
    int bonusPoint;

   Product(int price, int bonusPoint){
        this.price = price;
        this.bonusPoint = bonusPoint;
    }
}

class Phone extends Product{
    Phone() {
        super(100, 0);
    }
}
class Mouse extends Product{
    Mouse() {
        super(1000, 10);
    }
}
class Monitor extends Product{
    Monitor() {
        super(500, 50);
    }
}

