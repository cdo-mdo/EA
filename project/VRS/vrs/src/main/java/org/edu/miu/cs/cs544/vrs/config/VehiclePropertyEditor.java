package org.edu.miu.cs.cs544.vrs.config;

import org.edu.miu.cs.cs544.vrs.Entity.Vehicle;
import org.edu.miu.cs.cs544.vrs.Entity.VehicleStatus;
import org.springframework.stereotype.Component;

import java.beans.PropertyEditorSupport;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class VehiclePropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String filePath) throws IllegalArgumentException {
        List<Vehicle> vehicles = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean firstLine = true; // skip header row
            while ((line = br.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }
                String[] fields = line.split(",");
                if (fields.length != 6) {
                    throw new IllegalArgumentException("Invalid number of fields in line " + line);
                }
                Vehicle vehicle = new Vehicle();
                vehicle.setLicensePlate(fields[0]);
                vehicle.setMake(fields[1]);
                vehicle.setModel(fields[2]);
                vehicle.setColor(fields[3]);
                vehicle.setYear(Integer.parseInt(fields[4]));
                vehicle.setStatus(VehicleStatus.valueOf(fields[5]));
                vehicles.add(vehicle);
            }
        }
        catch (IOException e) {
            throw new IllegalArgumentException("Error reading file " + filePath);
        }
        setValue(vehicles);
    }


}
