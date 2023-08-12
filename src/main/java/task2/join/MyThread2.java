package task2.join;

public class MyThread2 extends Thread {
    private Thread myThreadTwo;

    public void setMyThreadTwo(Thread myThreadTwo) {
        this.myThreadTwo = myThreadTwo;
    }

    @Override
    public void run() {
        try {
            sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("MyOtherThread start...");
        try {
            myThreadTwo.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("MyOtherThread finished...");
    }
}
