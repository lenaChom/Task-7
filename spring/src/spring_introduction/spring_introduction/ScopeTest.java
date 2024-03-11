package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog dog = context.getBean("dog", Dog.class);
        dog.say();


//        Dog myDog = context.getBean("dog", Dog.class);
//
//        System.out.println("Переменные ссылаются на один и тот же объект? "+ (dog == myDog));
//        System.out.println(dog);
//        System.out.println(myDog);

        context.close();


    }
}
