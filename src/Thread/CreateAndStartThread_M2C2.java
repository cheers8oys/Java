package Thread;

class VideoFileRunnable implements Runnable{
    @Override
    public void run(){
        int[] intArray = {1, 2, 3, 4, 5};

        for (int i = 0; i < intArray.length; i++){
            System.out.println("(비디오 프레임) " +intArray[i]);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e){}
        }
    }
}

public class CreateAndStartThread_M2C2 {
    public static void main(String[] args) {
        Runnable smiFileRunnble = new SMIFileRunnable();
        Thread thread1 = new Thread(smiFileRunnble);
        thread1.start();

        Runnable videoFileRunnable = new VideoFileRunnable();
        Thread thread2 = new Thread(videoFileRunnable);
        thread2.start();
    }
}
