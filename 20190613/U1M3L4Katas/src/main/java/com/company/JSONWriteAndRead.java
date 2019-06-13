package com.company;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class JSONWriteAndRead {
    public static void main(String[] args) {
        PrintWriter writer = null;

        Car car1 = new Car();
        car1.setMake("Toyota");
        car1.setModel("Camry");
        car1.setMake("2012");
        car1.setMake("Blue");

        Car car2 = new Car();
        car2.setMake("Honda");
        car2.setModel("Civic");
        car2.setMake("2001");
        car2.setMake("Silver");

        Car car3 = new Car();
        car3.setMake("Jeep");
        car3.setModel("Wrangler");
        car3.setMake("2009");
        car3.setMake("Rust");

        Car car4 = new Car();
        car4.setMake("Tesla");
        car4.setModel("Roadster");
        car4.setMake("2018");
        car4.setMake("Black");

        Car car5 = new Car();
        car5.setMake("Ford");
        car5.setModel("Mustang");
        car5.setMake("1964");
        car5.setMake("Red");

List<Car> carList = new ArrayList<Car>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);



        try {
            ObjectMapper mapper = new ObjectMapper();
            String jsonStringCars = mapper.writeValueAsString(carList);

            System.out.println(jsonStringCars);


            writer = new PrintWriter(new FileWriter("hanCarList.json"));

            writer.println(jsonStringCars);


        } catch (JsonProcessingException e) {
            System.out.println("ERROR: Trouble converting object to JSON string: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("ERROR: Could not write to file: " + e.getMessage());
        } finally {
            if (writer != null) {
                writer.flush();
                writer.close();
            }
        }

    }
}
