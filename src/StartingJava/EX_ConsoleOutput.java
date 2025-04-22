package StartingJava;

public class EX_ConsoleOutput {

    public static void main(String[] args) {

        // 형식대로 출력하기 - System.out.printf()

        System.out.printf("%d\n", 30); // 10진수 정수 출력
        System.out.printf("o\n", 30); // 8진수 정수 출력
        System.out.printf("%x\n", 30); // 16진수 정수 출력

        System.out.printf("%s\n", "문자열 출력"); // 문자열 출력
        System.out.printf("%f\n", 5.8); // 실수 출력
        System.out.printf("%4.2f\n", 5.8); //%전체자리수 + . + 소수점 자리수 +f
        System.out.printf("%d와 %s\n", 10, "주년 축하합니다"); // 하나의 포맷안에[ 여러 개의 % 출력



    }
}
