package 자료형;

public class EX_float과doule의_정밀도_비교 {
    public static void main(String[] args) {

        float f1 = 1.0000001f;
        System.out.println(f1);
        float f2 = 1.00000001f;
        System.out.println(f2);

        double d1 = 1.000000000000001;
        System.out.println(d1);
        double d2 = 1.0000000000000001;
        System.out.println(d2);
    }
}
