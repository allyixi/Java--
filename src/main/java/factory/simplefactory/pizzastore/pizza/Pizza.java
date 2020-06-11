package factory.simplefactory.pizzastore.pizza;

//将Pizza做成抽象的
public abstract class Pizza {
    protected String name;

    public abstract void prepare();

    public void bake() {
        System.out.println(name + " bake");
    }

    public void cut() {
        System.out.println(name + " cut");
    }

    public void box() {
        System.out.println(name + " box");
    }

    public void setName(String name) {
        this.name = name;
    }
}
