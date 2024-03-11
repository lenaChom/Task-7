package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

//        Dog dog = context.getBean("myPet", Dog.class);
//        Dog myDog = context.getBean("myPet", Dog.class);
//        dog.setName("Belka");
//        myDog.setName("Strelka");
//
//        System.out.println("Переменные ссылаются на один и тот же объект? " + (dog == myDog));
//        System.out.println(dog);
//        System.out.println(myDog);
//        System.out.println(dog.getName());
//        System.out.println(myDog.getName());

        context.close();


    }
}
