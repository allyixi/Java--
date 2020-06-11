package Dependency;

public class DependencyPassThreeWay {
    public static void main(String[] args) {

    }
}

////方法一：接口传递依赖
//interface IOpenAndClose{
//    void open(ITV tv);
//}
//
//interface ITV{
//    void play();
//}
//
//class OpenAndClose implements IOpenAndClose{
//    public void open(ITV tv) {
//        tv.play();
//    }
//}

////方法2：通过构造方法传递依赖
//interface IOpenAndClose{
//    void open();
//}
//
//interface ITV{
//    void play();
//}
//
//class OpenAndClose implements IOpenAndClose{
//    public ITV tv;
//    public OpenAndClose(ITV tv){
//        this.tv=tv;
//    }
//    public void open() {
//        this.tv.play();
//    }
//}

//方法3：通过setter方法传递依赖
interface IOpenAndClose{
    void open();
    void setTv(ITV tv);
}

interface ITV{
    void play();
}

class OpenAndClose implements IOpenAndClose{
    private ITV tv;
    public void open() {
        this.tv.play();
    }

    public void setTv(ITV tv) {
        this.tv=tv;
    }
}
