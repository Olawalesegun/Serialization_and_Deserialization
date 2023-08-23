package africa.semicolon.serialization;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Kata2 {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        Car car = new Car();
        car.setBrand("Toyota");
        car.setColor("Purple");
        car.setMileage(3_000_000L);
        car.setModel("Camry");
        String location = "/home/user/Documents/jToJson/src/africa/semicolon/serialization/cars.json";
        Path path = Path.of(location);
        try(OutputStream outputStream = Files.newOutputStream(path);
            PrintStream printStream = new PrintStream(outputStream)) {
            System.setOut(printStream);
            objectMapper.writeValue(System.out, car);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}
