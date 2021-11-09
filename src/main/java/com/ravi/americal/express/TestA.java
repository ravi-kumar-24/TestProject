package com.ravi.americal.express;


class A{
    public A(){
        this(1);
    }
    public A(int as){
        System.out.println("in A"+as);
    }
}

class B extends A{

    public B(int a){
        super();
        System.out.println("in class B");
    }

}


public class TestA {

    public static void main(String[] args) {
        B b = new B(1);
    }
}
