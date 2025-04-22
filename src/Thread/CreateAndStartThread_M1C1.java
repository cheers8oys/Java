package Thread;

// public을 붙이는 클래스는 반드시 파일명.java와 같아야 한다.
// why?
// 자바 컴파일러가 소스를 쉽게 찾고 관리할 수 있도록 하기 위함입니다.
// 여러 개의 public 클래스를 한 파일에 두지 못하게 하여, 코드의 명확성과 관리성을 높여줍니다.
class SMIFileThread extends Thread{
    @Override
    public void run() {
        String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {}

        for(int i = 0; i < strArray.length; i++){
            System.out.println(" - (자막 번호) " + strArray[i]);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e){}
        }
    }
}

public class CreateAndStartThread_M1C1 {
    public static void main(String[] args){

        Thread smiFileThread = new SMIFileThread();
        smiFileThread.start();

        int[] intArray = {1,2,3,4,5};

        for (int i = 0; i < intArray.length; i++){
            System.out.println("(비디오 프레임) "+ intArray[i]);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e){}
        }
    }
}
