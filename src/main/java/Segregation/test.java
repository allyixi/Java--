package Segregation;

public class test {
    public static void main(String[] args) {
        A a=new A();
        a.depend1(new B());
        a.depend2(new B());
        C c=new C();
        c.depend1(new D());
        c.depend3(new D());
    }
}

interface Interface1{
    void operation1();
}

interface Interface2{
    void operation2();
    void operation3();
}

interface Interface3{
    void operation4();
    void operation5();
}

class B implements Interface1,Interface2{

    public void operation1() {
        System.out.println("o1");
    }

    public void operation2() {
        System.out.println("o2");
    }

    public void operation3() {
        System.out.println("o3");
    }
}

class D implements Interface1,Interface3{

    public void operation1() {
        System.out.println("o1");
    }

    public void operation4() {
        System.out.println("o4");
    }

    public void operation5() {
        System.out.println("o5");
    }
}


class A{
    void depend1(Interface1 in){
        in.operation1();
    }

    void depend2(Interface2 in){
        in.operation2();
        in.operation3();
    }
}

class C{
    void depend1(Interface1 in){
        in.operation1();
    }

    void depend3(Interface3 in){
        in.operation4();
        in.operation5();
    }
}