package org.edu.miu.cs.cs544.exercise;

import org.edu.miu.cs.cs544.exercise.exercise_3.Game;
import org.edu.miu.cs.cs544.exercise.exercise_3.config.SpringConfig;
import org.edu.miu.cs.cs544.exercise.exercise_3.config.SpringConfig1;
import org.edu.miu.cs.cs544.exercise.exercise_3.config.SpringConfig2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static void useClassConfig() {
        System.out.println();
        System.out.println("Use " + SpringConfig.class.getSimpleName());
        ApplicationContext springContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Game game = springContext.getBean("game", Game.class);
        game.play();
    }

    private static void useClassConfig1() {
        System.out.println();
        System.out.println("Use " + SpringConfig1.class.getSimpleName());
        ApplicationContext springContext = new AnnotationConfigApplicationContext(SpringConfig1.class);
        Game game = springContext.getBean("game", Game.class);
        game.play();
    }

    private static void useClassConfig2() {
        System.out.println();
        System.out.println("Use " + SpringConfig2.class.getSimpleName());
        ApplicationContext springContext = new AnnotationConfigApplicationContext(SpringConfig2.class);
        Game game = springContext.getBean("game", Game.class);
        game.play();
    }

    private static void useXMLConfig() {
        System.out.println();
        System.out.println("Use XML config" + "Config.xml");
        ApplicationContext springContext = new ClassPathXmlApplicationContext("Config.xml");
        Game game = springContext.getBean("game", Game.class);
        game.play();
    }

    private static void useXMLConfig1() {
        System.out.println();
        System.out.println("Use XML config" + "Config1.xml");
        ApplicationContext springContext = new ClassPathXmlApplicationContext("Config1.xml");
        Game game = springContext.getBean("game", Game.class);
        game.play();
    }

    private static void useXMLConfig2() {
        System.out.println();
        System.out.println("Use XML config" + "Config2.xml");
        ApplicationContext springContext = new ClassPathXmlApplicationContext("Config2.xml");
        Game game = springContext.getBean("game", Game.class);
        game.play();
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Start Application");

        useXMLConfig();
        useClassConfig();

        useXMLConfig1();
        useXMLConfig2();

        useClassConfig1();
        useClassConfig2();
    }
}