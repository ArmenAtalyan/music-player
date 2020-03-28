package com.demoSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        TestBean bean = context.getBean("testBean", TestBean.class);

        // call method on the bean
        System.out.println(bean.getName());

        // close the context
        context.close();
    }
}
