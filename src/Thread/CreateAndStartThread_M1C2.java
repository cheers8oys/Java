package Thread;

import java.sql.SQLOutput;

class SMIFileThread2 extends Thread {
    @Override
    public void run(){
        String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};

        try{
            Thread.sleep(10);
        } catch (InterruptedException e){}

        for(int i = 0; i < strArray.length; i++){
            System.out.println(" - (자막 번호) " + strArray[i]);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e){}
        }
    }
}

class VideoFileThread extends Thread {
    @Override
    public void run(){
        int[] intArray = {1, 2, 3, 4, 5};

        for (int i = 0; i < intArray.length; i++){
            System.out.println("(비디오 프레임) " + intArray[i]);
            try{
                Thread.sleep(200);
            } catch (InterruptedException e){}
        }
    }
}


public class CreateAndStartThread_M1C2 {
    public static void main(String[] args) {
        Thread smiFileThread = new SMIFileThread2();
        smiFileThread.start();

        Thread videoFileThread = new VideoFileThread();
        videoFileThread.start();
    }

}
