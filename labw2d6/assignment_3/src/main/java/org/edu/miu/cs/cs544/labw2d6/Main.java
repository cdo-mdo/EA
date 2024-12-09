package org.edu.miu.cs.cs544.labw2d6;

import org.edu.miu.cs.cs544.labw2d6.assignment_3.Game;
import org.edu.miu.cs.cs544.labw2d6.assignment_3.PrototypeBeanCounter;
import org.edu.miu.cs.cs544.labw2d6.assignment_3.SingletonBeanCounter;
import org.edu.miu.cs.cs544.labw2d6.assignment_3.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Application count number of Singleton and number of Prototype bean");

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Game game = (Game) context.getBean("game");
        game.play();

        System.out.println("number of bean defined: " + context.getBeanDefinitionCount());
        String[] names = context.getBeanDefinitionNames();
        System.out.println("number of bean named defined: " + names.length);
        for (String name : names) {
            System.out.println("    " + name);
        }

        System.out.println("Number of singleton bean: " + SingletonBeanCounter.counter);
        System.out.println("Number of prototype bean: " + PrototypeBeanCounter.counter);

        Test test = context.getBean("test", Test.class);
        System.out.println("#" + test.hashCode());

        test = context.getBean("test", Test.class);
        System.out.println("#" + test.hashCode());

        System.out.println("Number of singleton bean: " + SingletonBeanCounter.counter);
        System.out.println("Number of prototype bean: " + PrototypeBeanCounter.counter);

    }
}