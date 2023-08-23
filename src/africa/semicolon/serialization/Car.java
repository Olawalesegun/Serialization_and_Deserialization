package africa.semicolon.serialization;

public class Car {
    private String brand;
    private String model;
    private String color;
    private long mileage;
    public long getMileage() {
        return mileage;
    }
    public void setMileage(long mileage) {
        this.mileage = mileage;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
