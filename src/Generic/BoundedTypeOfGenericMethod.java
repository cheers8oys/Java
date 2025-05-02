package Generic;

class AC {
    public <T extends Number> void method1(T t){
        System.out.println(t.intValue());
    }
}

interface Myinterface {
    public abstract void print();
}

class BC {
    public <T extends Myinterface> void method1(T t){
        t.print();
    }
}

public class BoundedTypeOfGenericMethod {
    public static void main(String[] args) {
        AC ac = new AC();
        ac.method1(5.8);

        BC bc = new BC();
        bc.method1(new Myinterface() {
            @Override
            public void print() {
                    System.out.println("print() 구현");
            }
        });
    }
}
