package Generic;

class Orange{}
class Banana{}
class Something<T>{
    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}

public class Solution2_Generic {
    public static void main(String[] args) {
        Something<Orange> something = new Something<>();
        something.setT(new Orange());
        Orange orange = something.getT();

        Something<Banana> something1 = new Something<>();
        something1.setT(new Banana());
        Banana banana = something1.getT();

        Something<Orange> something2 = new Something<>();
        something2.setT(new Orange());
//        Banana banana1 = something2.getT();


    }
}
