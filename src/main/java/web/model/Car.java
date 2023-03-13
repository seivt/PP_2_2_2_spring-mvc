package web.model;

import java.util.Objects;

public class Car {
    private String model;
    private String color;
    private int yearOfProduction;

    public Car() {
    }

    public Car(String model, String color, int yearOfProduction) {
        this.model = model;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfProduction == car.yearOfProduction && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, yearOfProduction);
    }
}
