package org.edu.miu.cs.cs544.exercise;

import org.edu.miu.cs.cs544.exercise.config.BikeConfig;
import org.edu.miu.cs.cs544.exercise.config.BikeConfig1;
import org.edu.miu.cs.cs544.exercise.config.SpringConfig;
import org.edu.miu.cs.cs544.exercise.exercise_5.Bike;
import org.edu.miu.cs.cs544.exercise.exercise_5.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static void useXMLConfig() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        Car car = context.getBean("vehicle", Car.class);
        System.out.println(car);

    }

    private static void useXMLBikeConfig() {
        ApplicationContext context = new ClassPathXmlApplicationContext("BikeConfig.xml");
        Bike bike = context.getBean("bike", Bike.class);
        System.out.println(bike);
    }

    private static void useXMLBikeConfig1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("BikeConfig1.xml");
        Bike bike = context.getBean("bike", Bike.class);
        System.out.println(bike);
    }

    private static void useFileConfig() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Car car = context.getBean("vehicle", Car.class);
        System.out.println(car);
    }

    private static void useFileBikeConfig() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BikeConfig.class);
        Bike bike = context.getBean("bike", Bike.class);
        System.out.println(bike);
    }

    private static void useFileBikeConfig1() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BikeConfig1.class);
        Bike bike = context.getBean("bike", Bike.class);
        System.out.println(bike);
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Start Application");

        useXMLConfig();
        useFileConfig();
        useXMLBikeConfig();
        useFileBikeConfig();
        useXMLBikeConfig1();
        useFileBikeConfig1();
    }
}