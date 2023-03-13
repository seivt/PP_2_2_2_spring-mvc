package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Volvo", "Yellow", 1986));
        carList.add(new Car("Volga", "White", 1995));
        carList.add(new Car("Lada", "Black", 2012));
        carList.add(new Car("Alfa Romeo", "Red", 2011));
        carList.add(new Car("Haval", "Blue", 2021));
    }

    @Override
    public List<Car> getCars(int numberOfCars) {


        return carList.stream().limit(numberOfCars).collect(Collectors.toList());
    }
}
