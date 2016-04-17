package com.company;

public class Main {

    public static void main(String[] args) {
	A d=new A(3);
        System.out.println(A.a);

        A.geta();

        /*d.c();
        System.out.println(A.a);*/

        A d1=new A(3);
        //System.out.println(d.a);
        //System.out.println(d1.a);
        B.a=100;
        System.out.println(A.a);
    }
}
