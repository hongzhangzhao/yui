package spittr.injection.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-injection.xml");
        InjectionService is = context.getBean(InjectionService.class);
        is.save("Hello World");
    }
}
