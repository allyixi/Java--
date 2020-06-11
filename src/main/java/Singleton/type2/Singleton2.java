package Singleton.type2;

public class Singleton2 {
    public static void main(String[] args) {
        //测试
        Singleton instance1=Singleton.getInstance();
        Singleton instance2=Singleton.getInstance();
        System.out.println(instance1==instance2);//true
    }
}

//饿汉式(静态代码)
class Singleton{

    //1.构造器私有化,外部不能new
    private Singleton(){

    }

    //2.本类静态变量
    private static Singleton instance;

    //3.在静态代码块中创建单例对象
    static{
        instance=new Singleton();
    }

    //4.提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}
