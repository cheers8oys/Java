package Generic;

class Myclass<T>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
public class SingleGenericArgument {
    public static void main(String[] args) {
        Myclass<String> mc1 = new Myclass<>();
        mc1.setT("안녕");
        Myclass<Integer> mc2 = new Myclass<>();
        mc2.setT(1);
        System.out.println(mc1.getT());
        System.out.println(mc2.getT());
    }
}
