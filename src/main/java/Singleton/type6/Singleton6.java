package Singleton.type6;

public class Singleton6 {
    public static void main(String[] args) {
        //测试
        Singleton instance1=Singleton.getInstance();
        Singleton instance2=Singleton.getInstance();
        System.out.println(instance1==instance2);//true
    }
}

//双重检查
class Singleton{

    private Singleton(){

    }

    private static volatile Singleton instance;//volatile：修改值立即更新到主存

    //加入双重检查，解决线程安全问题，同时解决懒加载问题
    public static Singleton getInstance(){
        if(instance==null){
            synchronized (Singleton.class){
                if(instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
}