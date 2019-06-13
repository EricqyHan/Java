package com.company;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class PhoneReader {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new XmlMapper();
            List<Phone> phoneList;
            phoneList = mapper.readValue(new File("phones,xml"), new TypeReference<List<Phone>>(){});

            for (Phone phone : phoneList) {
                System.out.println("---------------");
                System.out.println(phone.getBrand());
                System.out.println(phone.getModel());
                System.out.println(phone.getProcessor());
                System.out.println(phone.getStorage());
                System.out.println(phone.getPrice());
            }
        } catch (IOException e) {
            System.out.println("Error: Problem encountered reading file " + e.getMessage());
        }
    }
}
