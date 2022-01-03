package org.example.demo03.zzz;

import lombok.Data;

@Data
public class TempTest extends AbsBeen implements IAction {
    private String name;
    private String name2;

    public static void main(String[] args) {
        System.out.println("TempTest.main");
    }

    @Override
    public String sayHello() {
        System.out.println("TempTest.sayHello");
        return "hello";
    }

    @Override
    public String run() {
        System.out.println("TempTest.run");
        String running = "running";
        return running;
    }
}
