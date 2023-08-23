import africa.semicolon.serialization.Car;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        Car car = new Car();
        car.setBrand("Toyota");
        car.setColor("Purple");
        car.setMileage(3_000_000L);
        car.setModel("Camry");
        try {
            //This is to make the attributes/properties serializable
            objectMapper.writeValue(System.out, car);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}