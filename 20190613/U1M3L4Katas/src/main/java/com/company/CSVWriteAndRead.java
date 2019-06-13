package com.company;

import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class CSVWriteAndRead {
    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();

        carList.add(new Car(2012, "Toyota", "Camry", "Blue"));
        carList.add(new Car(2001, "Honda", "Civic", "Silver"));
        carList.add(new Car(2009, "Jeep", "Wrangler", "Rust"));
        carList.add(new Car(2018, "Tesla", "Roadster", "Black"));
        carList.add(new Car(1964, "Ford", "Mustang", "Red"));

        try {
                Writer writer = new FileWriter("Han's_car_file.csv");
                StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();
                beanToCsv.write(carList);
                writer.close();
            //
            List<Car> carsFromCSV = new CsvToBeanBuilder<Car>(new FileReader("Han's_car_file.csv")).withType(Car.class).build().parse();
            for(Car cars: carsFromCSV) {
                System.out.printf("%n");
                System.out.println(cars.getYear());
                System.out.println(cars.getMake());
                System.out.println(cars.getModel());
                System.out.println(cars.getColor());

            }
            System.out.printf(" %n");
        } catch (Exception e) {
            System.out.println("An error occurred " + e);
        }
    }
}



