package web.service;

import org.springframework.stereotype.Service;
import web.entity.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Lada", "2110", 2002));
        carList.add(new Car("Lada", "2114", 2006));
        carList.add(new Car("Ford", "Mondeo 3", 2001));
        carList.add(new Car("Chevrolet", "Lacetti", 2012));
        carList.add(new Car("Land Rover", "Range Rover Evoque", 2013));
    }

    @Override
    public List<Car> showCars(int carCount) {
        if (carCount == 0) {
            return carList;
        } else {
            return carList.stream()
                          .limit(carCount)
                          .collect(Collectors.toList());
        }
    }

}
