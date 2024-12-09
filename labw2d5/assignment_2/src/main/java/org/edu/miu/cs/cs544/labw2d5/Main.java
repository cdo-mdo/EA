package org.edu.miu.cs.cs544.labw2d5;

import org.edu.miu.cs.cs544.labw2d5.assignment_2.Bike;
import org.edu.miu.cs.cs544.labw2d5.assignment_2.Car;
import org.edu.miu.cs.cs544.labw2d5.assignment_2.Game;
import org.edu.miu.cs.cs544.labw2d5.config.VehicleConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Application use autowire by Annotation Config");

        ApplicationContext context = new AnnotationConfigApplicationContext(VehicleConfig.class);
        Game game = (Game) context.getBean("game");
        game.play();
    }
}