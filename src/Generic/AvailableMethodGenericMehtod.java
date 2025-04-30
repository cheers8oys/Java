package Generic;

class A {
    public <T> void method(T t){
        // System.out.println(t.length()); 불가능
        System.out.println(t.equals("안녕")); // Object 메서드이므로 가능
    }
}

public class AvailableMethodGenericMehtod {
    public static void main(String[] args) {
     A a = new A();
     a.method("안녕");
    }
}
