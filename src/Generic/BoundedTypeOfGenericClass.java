package Generic;

class AB {}

class BB extends AB{}

class CB extends BB{}

class DB <T extends BB> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}


public class BoundedTypeOfGenericClass {
    public static void main(String[] args) {

        //DB<AB> d1 = new DB<>(); 타입 제한 범위 밖의 클래스이므로 불가능
        DB<BB> d2 = new DB<>();
        DB<CB> d3 = new DB<>();
        DB d4 = new DB();

        d2.setT(new BB());
        d2.setT(new CB());

        //d3.set(new BB()); d3 객체는 객체를 생성할 때 제네릭 타입으로 CB를 지정하므로 불가능
        d3.setT(new CB());

        d4.setT(new BB());
        d4.setT(new CB());
    }
}
