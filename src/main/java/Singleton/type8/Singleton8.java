package Singleton.type8;

public class Singleton8 {
    public static void main(String[] args) {
        //测试
        Singleton instance1=Singleton.INSTANCE;
        Singleton instance2=Singleton.INSTANCE;
        System.out.println(instance1==instance2);//true
    }
}

//枚举
enum Singleton{
    INSTANCE;
    public void sayOK(){
        System.out.println("ok");
    }
}