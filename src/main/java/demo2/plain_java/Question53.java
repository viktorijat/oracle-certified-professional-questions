package demo2.plain_java;

class A {
    public A() {
        System.out.println("A ");
    }
}

class B extends A {
    public B() {
        //super();
        System.out.println("B ");
    }
}

public class Question53 extends B {

    public Question53() {
        //super();
        System.out.println("C ");
    }

    public static void main(String[] args) {
        Question53 c = new Question53();
    }
}
