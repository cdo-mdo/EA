package org.edu.miu.cs.cs544.exercise;

import org.edu.miu.cs.cs544.exercise.exercise_6.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Start Application");

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        A a = (A) context.getBean("a");

    }
}