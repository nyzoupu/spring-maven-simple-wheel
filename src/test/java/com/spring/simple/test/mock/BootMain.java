package com.spring.simple.test.mock;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.simple.mock.Boss;
import com.spring.simple.test.tags.User;

public class BootMain {

    public BootMain() {
    }

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("testBean");  
        System.out.println(user.getUserName()+ ":" + user.getEmail());  
        
//        Boss boss = (Boss)context.getBean("boss");
//        boss.indroduce();
//        new Thread(new Thread1(context)).start();
//        Boss boss2 = (Boss)context.getBean("boss2");
//        boss2.indroduce();
    }

}

class Thread1 implements Runnable{
    private ApplicationContext context;
    public Thread1(ApplicationContext context){
        this.context = context;
    }
    @Override
    public void run() {
        Boss boss = (Boss)context.getBean("boss");
        boss.indroduce();
    }
}
