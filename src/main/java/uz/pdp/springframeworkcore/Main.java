package uz.pdp.springframeworkcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("ioc-settings.xml");
//        MyBean2 myBean2 = container.getBean(MyBean2.class);
//        myBean2.hi();
//        System.out.println(container.getBean(Person.class).toString());
//        System.out.println("Hello this is main method");
//        container.getBean(MyBean2.class).hi();
        Person person = container.getBean(Person.class);
        System.out.println(person);
        System.out.println(container.getBean(BaseDAO.class));
        container.close();
    }
}