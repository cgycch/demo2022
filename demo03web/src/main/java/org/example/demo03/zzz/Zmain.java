package org.example.demo03.zzz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Zmain {

    private static final String nihao = "dddd";

    public static void main(String[] args) {
        TempTest test1 = new TempTest();
        TempTest2 test2 = new TempTest2();
        test1.run();
        test2.run();
        String dd = "";
        String dddd = nihao;
        System.out.println(dddd);
        hello("");
    }
    public static void hello(String s){
        System.out.println("Zmain.hello");
    }
}
