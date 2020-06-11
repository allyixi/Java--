package Singleton.type3;

public class Singleton3 {
    public static void main(String[] args) {
        //测试
        Singleton instance1=Singleton.getInstance();
        Singleton instance2=Singleton.getInstance();
        System.out.println(instance1==instance2);//true
    }
}

//懒汉式(线程不安全)
class Singleton{

    private Singleton(){

    }

    private static Singleton instance;

    //提供一个静态的公有方法，当使用到该方法时，才去创建instance对象
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }

}
