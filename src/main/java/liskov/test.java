package liskov;

public class test {
    public static void main(String[] args) {
        A a=new A();
        System.out.println("11-3="+a.func1(11,3));

        B b=new B();
        System.out.println("11-3="+b.func1(11,3));
        System.out.println("11+3+9="+b.func2(11,3));
    }
}

class Base{
    public int func1(int num1,int num2){
        return num1-num2;
    }
}

class A extends Base{
    public int func1(int num1,int num2){
        return num1-num2;
    }
}

class B extends Base{
    //B类使用A类的方法，采用形成组合
    private A a=new A();
    public int func1(int num1,int num2){
        return num1+num2;
    }

    public int func2(int num1,int num2){
        return func1(num1,num2) +9;
    }

    public int func3(int num1,int num2){
        return a.func1(num1,num2);
    }
}
