package Singleton.type7;

public class Singleton7 {
    public static void main(String[] args) {
        //测试
        Singleton instance1=Singleton.getInstance();
        Singleton instance2=Singleton.getInstance();
        System.out.println(instance1==instance2);//true
    }
}

//静态内部类
//静态内部类特点：1.外部类装置的时候，内部静态类不会被装载 2.内部调用的时候，静态内部类只会执行一次
class Singleton{
    private Singleton(){

    }

    //静态内部类，该类中有一个静态属性Singleton
    //JVM处理类加载的时候是线程安全的
    public static class SingletonInstance{
        private static final Singleton instance=new Singleton();
    }

    //提供一个静态公有方法，直接返回SingletonInstance.instance
    public static Singleton getInstance(){
        return SingletonInstance.instance;
    }

}
