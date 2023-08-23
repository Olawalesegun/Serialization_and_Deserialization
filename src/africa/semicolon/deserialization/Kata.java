package africa.semicolon.deserialization;

import africa.semicolon.serialization.Car;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Kata {

    public static void main(String[] args) {
        String json = "{\"brand\":\"Peugeot\",\"model\":\"404\",\"color\":\"Black\",\"mileage\":4000}";
        //THe object mapper i a class that is used to convert java object to json and json object to java
        ObjectMapper mapper = new ObjectMapper();
        Car car = null;
        try {
            car = mapper.readValue(json.getBytes(), Car.class);
            System.out.println(car.getBrand());
            System.out.println(car.getColor());
            System.out.println(car.getModel());
            System.out.println(car.getMileage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        //Car car = mapper.convertValue(json, Car.class);
        /*System.out.println(car);*/
    }
}
