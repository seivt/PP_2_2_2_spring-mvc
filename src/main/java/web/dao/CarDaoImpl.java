package web.dao;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDaoImpl implements CarDao {
    private final List<Car> carList = new ArrayList<>();

    @Override
    public List<Car> getCars(int numberOfCars) {
        carList.add(new Car("Volvo", "Yellow", 1986));
        carList.add(new Car("Volga", "White", 1995));
        carList.add(new Car("Lada", "Black", 2012));
        carList.add(new Car("Alfa Romeo", "Red", 2011));
        carList.add(new Car("Haval", "Blue", 2021));

        return carList.stream().limit(numberOfCars).collect(Collectors.toList());
    }
}
