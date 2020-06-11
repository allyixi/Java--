package principle.singleresponsibility;

public class SingleResponsiblity1 {
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        v.run("摩托");
    }
}

class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle);
    }
}
