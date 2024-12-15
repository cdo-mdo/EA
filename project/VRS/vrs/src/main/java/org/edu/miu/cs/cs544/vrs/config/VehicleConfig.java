package org.edu.miu.cs.cs544.vrs.config;

import org.edu.miu.cs.cs544.vrs.Entity.Vehicle;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class VehicleConfig {

    public List<Vehicle> vehicles() {
        VehiclePropertyEditor editor = new VehiclePropertyEditor();
        editor.setAsText("src/main/resources/data/vehicles.csv");
        return (List<Vehicle>) editor.getValue();
    }
}
