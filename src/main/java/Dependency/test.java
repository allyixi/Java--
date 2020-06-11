package Dependency;

public class test {
    public static void main(String[] args) {
        A a = new A();
        a.getInfo(new B());
        a.getInfo(new C());
    }
}

class A {
    public void getInfo(inteface1 in1) {
        in1.getInfo();
    }
}

interface inteface1 {
    void getInfo();
}


class B implements inteface1 {
    public void getInfo() {
        System.out.println("B");
    }
}

class C implements inteface1 {
    public void getInfo() {
        System.out.println("C");
    }
}

//class A{
//    public void getInfo(B b){
//        b.getInfo();
//    }
//}
//
//class B{
//    public void getInfo(){
//        System.out.println("B");
//    }
//}