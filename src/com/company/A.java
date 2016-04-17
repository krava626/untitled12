package com.company;


public class A {
    static int a;
    int b;

    static void geta() {
        System.out.println(a);
    }

    public A(int b) {
        this.b = b;
        a++;
    }


    void c() {
        a++;

    }

}
