package com.spring.simple.test.mock;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.simple.mock.Boss;

public class BootMain {

    public BootMain() {
    }

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Boss boss = (Boss)context.getBean("boss");
        boss.indroduce();
        Boss boss2 = (Boss)context.getBean("boss2");
        boss2.indroduce();
    }

}
