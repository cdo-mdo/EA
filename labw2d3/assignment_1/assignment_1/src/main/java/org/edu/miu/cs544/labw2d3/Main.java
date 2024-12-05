package org.edu.miu.cs544.labw2d3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Start Application");

        ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");

        Game game = springContext.getBean("game", Game.class);
        game.play();

    }
}