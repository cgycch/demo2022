package org.example.demo03;

import org.example.demo03.config.My;
import org.example.demo03.zzz.TempTest;
import org.example.demo03.zzz.TempTest2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

import static java.lang.System.*;

@SpringBootApplication
@EnableConfigurationProperties(My.class)
public class Demo03Web {

    public static void main(String[] args) {
        out.println("Demo03Web.main");
        ConfigurableApplicationContext context = SpringApplication.run(Demo03Web.class, args);
        My my = context.getBean("my", My.class);
        out.println("my = " + my);
        TempTest dd = new TempTest();
        TempTest dd1 = new TempTest();
        TempTest dd2 = new TempTest();
        TempTest dd3usage = new TempTest();
        out.println(dd3usage);
        dd3usage.run();
        dd3usage.run();
        dd3usage.run();
        dd3usage.setName("name");
        dd3usage.setName2("name2");
        out.println(dd3usage.getName());
        TempTest2 dd4 = new TempTest2();
        dd4.run();
    }
}
