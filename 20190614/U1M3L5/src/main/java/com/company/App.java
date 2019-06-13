package com.company;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        try{
            // We need object mapper to be able to read from JSON file
            ObjectMapper mapper = new ObjectMapper();

            // Make the List with the info from JSON file
            List<Television> tvs = mapper.readValue(
                    new File("televisions.json"),
                    new TypeReference<List<Television>>(){});

            int screenSize = 60;

            // Stream print with screens greater 60
            tvs
                    .stream()
                    .filter(tv -> tv.getScreenSize() > screenSize)
                    .forEach(tv -> {
                        System.out.println("================");
                        System.out.println(tv.getBrand());
                        System.out.println(tv.getModel());
                        System.out.println(tv.getPrice());
                        System.out.println(tv.getScreenSize());
                    });
            // Group all Tv's by mfg
            System.out.println();
            Map<String, List<Television>> groupedTVs =
                    tvs
                            .stream()
                            .collect(Collectors.groupingBy(tv -> tv.getBrand()));
            Set<String> keys = groupedTVs.keySet();
            for(String key : keys) {
                System.out.println(key);
            }
            //Find and display average screen size
            System.out.println();

            // Print the average horsepower of the motorcycles in inventory
            double avgTVSize =
                    tvs
                            .stream()
                            .mapToInt(tv -> tv.getScreenSize())
                            .average()
                            .getAsDouble();

            System.out.println("Average TV Size is: " + avgTVSize);

            // Largest TV Size
            System.out.println();

            int largestTVSize =
                    tvs
                            .stream()
                            .mapToInt(tv -> tv.getScreenSize())
                            .max()
                            .getAsInt();

            System.out.println("Largest TV Size is: " + largestTVSize);


        }catch (FileNotFoundException e) {
            System.out.println("Could not find JSON file: " + e.getMessage());
        }catch (IOException e) {
            System.out.println("ERROR: Problem encountered reading JSON file - " + e.getMessage());
        }




    }
}
