package my_world.locks;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by root on 6/18/15.
 */
public class CyclicBarrierCycles {

    static CyclicBarrier barrier;

    public static void main(String[] args) throws InterruptedException {
        barrier = new CyclicBarrier(3, new Runnable() {
            @Override
            public void run() {
                System.out.println("Aale sagle.. let us play..!!");
            }
        });

        new Worker().start();
        Thread.sleep(1000);
        new Worker().start();
        Thread.sleep(1000);
        new Worker().start();
        Thread.sleep(1000);

        System.out.println("Barrier automatically resets. \n ===============");

        new Worker().start();
        Thread.sleep(1000);
        new Worker().start();
        Thread.sleep(1000);
        new Worker().start();
        Thread.sleep(1000);
        System.out.println("Again Barrier automatically resets.");
    }

}


class Worker extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Done with my work.. " + Thread.currentThread().getName() + " now Waiting to play.");
            CyclicBarrierCycles.barrier.await();
            System.out.println("Let's play. " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }


}

/*
Result
Done with my work.. Thread-0 now Waiting to play.
Done with my work.. Thread-1 now Waiting to play.
Done with my work.. Thread-2 now Waiting to play.
Aale sagle.. let us play..!!
Let's play. Thread-2
Let's play. Thread-0
Let's play. Thread-1
Barrier automatically resets.
 ===============
Done with my work.. Thread-3 now Waiting to play.
Done with my work.. Thread-4 now Waiting to play.
Done with my work.. Thread-5 now Waiting to play.
Aale sagle.. let us play..!!
Let's play. Thread-3
Let's play. Thread-4
Let's play. Thread-5
Again Barrier automatically resets.
 */