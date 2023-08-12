package task2.join;

public class MyThread1 extends Thread {
    private Thread myThreadOne;

    public void setMyThreadOne(Thread myThreadOne) {
        this.myThreadOne = myThreadOne;
    }

    @Override
    public void run() {
        System.out.println("MyThread start...");
        try {
            myThreadOne.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("MyThread finished...");
    }
}