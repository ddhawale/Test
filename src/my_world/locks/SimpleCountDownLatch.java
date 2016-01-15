package my_world.locks;

import java.util.concurrent.CountDownLatch;

/**
 * Created by root on 6/18/15.
 */
public class SimpleCountDownLatch {
    static CountDownLatch startSignal;

    public static void main(String[] args) throws InterruptedException {
        startSignal = new CountDownLatch(3);

        new MyWorker(" Waiting 1").start();
        Thread.sleep(1000);
        System.out.println("Giving first signal.");
        SimpleCountDownLatch.startSignal.countDown();
        new MyWorker(" Waiting 2").start();
        Thread.sleep(1000);
        System.out.println("Giving second signal.");
        SimpleCountDownLatch.startSignal.countDown();
        new MyWorker(" Waiting 3").start();
        Thread.sleep(1000);
        new MyWorker(" Waiting 4").start();
        Thread.sleep(1000);
        new MyWorker(" Waiting 5").start();
        Thread.sleep(1000);
        new MyWorker(" Waiting 6").start();
        Thread.sleep(1000);
        System.out.println("\n\n Giving last signal. All are waiting for me.. \n\n");
        SimpleCountDownLatch.startSignal.countDown();

        new MyWorker(" Non - Waiting 1").start();
        Thread.sleep(1000);
        new MyWorker(" Non - Waiting 2").start();

        Thread.sleep(3000);
        SimpleCountDownLatch.startSignal.countDown();
        SimpleCountDownLatch.startSignal.countDown();
        SimpleCountDownLatch.startSignal.countDown();
        System.out.println("Again gave all signals.");
        System.out.println("CountDownLatch not automatically resets.");

    }

}


class MyWorker extends Thread {
    MyWorker() {

    }
    MyWorker(String name) {
        super(name);
    }
    @Override
    public void run() {
        try {
            System.out.println("Done with my work.. " + Thread.currentThread().getName() + " now Waiting to play.");
            SimpleCountDownLatch.startSignal.await();
            System.out.println("Let's play. " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

/*
Done with my work..  Waiting 1 now Waiting to play.
Giving first signal.
Done with my work..  Waiting 2 now Waiting to play.
Giving second signal.
Done with my work..  Waiting 3 now Waiting to play.
Done with my work..  Waiting 4 now Waiting to play.
Done with my work..  Waiting 5 now Waiting to play.
Done with my work..  Waiting 6 now Waiting to play.


 Giving last signal. All are waiting for me..


Let's play.  Waiting 1
Let's play.  Waiting 2
Let's play.  Waiting 4
Let's play.  Waiting 3
Let's play.  Waiting 6
Let's play.  Waiting 5
Done with my work..  Non - Waiting 1 now Waiting to play.
Let's play.  Non - Waiting 1
Done with my work..  Non - Waiting 2 now Waiting to play.
Let's play.  Non - Waiting 2
Again gave all signals.
CountDownLatch not automatically resets.
 */