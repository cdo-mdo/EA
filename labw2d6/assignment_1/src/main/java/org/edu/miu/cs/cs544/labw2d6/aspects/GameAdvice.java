package org.edu.miu.cs.cs544.labw2d6.aspects;

import org.edu.miu.cs.cs544.labw2d6.assignment_1.Car;
import org.edu.miu.cs.cs544.labw2d6.assignment_1.Game;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@EnableAspectJAutoProxy
public class GameAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        if (target != null) {
            Game game = (Game) target;
            if (!(game.getVehicle().getClass().equals(Car.class))) {
                throw new Exception("Target is not a Car");
            }
        }
    }
}
