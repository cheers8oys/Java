package Generic;

class Apple1{}
class Pencil1{}

class Goods{
    private Object object = new Object();

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}


public class Solution_UsingObject {
    public static void main(String[] args) {
        Goods goods1 = new Goods();
        goods1.setObject(new Apple1());
        Apple1 apple1 = (Apple1)goods1.getObject();

        Goods goods2 = new Goods();
        goods2.setObject(new Pencil1());
        Pencil1 pencil1 = (Pencil1)goods2.getObject();
    }
}
