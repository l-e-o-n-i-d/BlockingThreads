package task2;

import task2.join.MyThread1;
import task2.join.MyThread2;

public class Main {
    public static void main(String[] args) {
        MyThread1 myThreadOne = new MyThread1();
        MyThread2 myThreadTwo = new MyThread2();

        myThreadOne.setMyThreadOne(myThreadTwo);
        myThreadTwo.setMyThreadTwo(myThreadOne);

        myThreadOne.start();
        myThreadTwo.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
