package org.example.demo03.zzz;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TempTest2 extends AbsBeen implements IAction {
    private String name;
    private String name2;

    public static void main(String[] args) {
        System.out.println("TempTest2.main");
    }

    @Override
    public String sayHello() {
        System.out.println("TempTest.sayHello");
        return "HELLO";
    }

    @Override
    public String run() {
        System.out.println("TempTest.run");
        Lock lock = new ReentrantLock();
        lock.lock();
        try {
            System.out.println("TempTest2.run");
        } finally {
            lock.unlock();
        }

        String running = "running";
        return running;
    }

    public static final Integer helloeee = null;

    public static void hello(String[] args) {

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("TempTest2.hello");
    }


}
