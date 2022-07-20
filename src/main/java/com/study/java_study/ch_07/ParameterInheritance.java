package com.study.java_study.ch_07;

public class ParameterInheritance {

    int money = 10000;
    int point = 0;

    // 중복된 코드를 매개변수의 다형성을 이용하여 제거
//    void buy(Phone t) {
//        money -= t.price;
//        point += t.bonusPoint;
//    }
//    void buy(Monitor m) {
//        money -= m.price;
//        point += m.bonusPoint;
//    }
//    void buy(Mouse mo) {
//        money -= mo.price;
//        point += mo.bonusPoint;
//    }

    void buy(Product product) {
        money -= product.price;
        point += product.bonusPoint;
    }

    public static void main(String[] args) {
        ParameterInheritance parameterInheritance = new ParameterInheritance();
        parameterInheritance.buy(new Monitor());
    }
}

class Product {
    int price;
    int bonusPoint;

    Product(int price, int bonusPoint) {
        this.price = price;
        this.bonusPoint = bonusPoint;
    }
}

class Phone extends Product {
    Phone() {
        super(100, 0);
    }
}

class Mouse extends Product {
    Mouse() {
        super(1000, 10);
    }
}

class Monitor extends Product {
    Monitor() {
        super(500, 50);
    }
}

