package Singleton.type4;

public class Singleton4 {
    public static void main(String[] args) {
        //测试
        Singleton instance1=Singleton.getInstance();
        Singleton instance2=Singleton.getInstance();
        System.out.println(instance1==instance2);//true
    }
}

//懒汉式(线程安全，同步方法)
class Singleton{

    private Singleton(){

    }

    private static Singleton instance;

    //提供一个静态的公有方法，当使用到该方法时，才去创建instance对象
    public static synchronized Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }

}

