package org.edu.miu.cs.cs544.labw2d6;

import org.edu.miu.cs.cs544.labw2d6.assignment_2.Game;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Application start");

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Game game = context.getBean("game", Game.class);
        game.play();

    }
}