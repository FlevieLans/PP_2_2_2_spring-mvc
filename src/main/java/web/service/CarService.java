package web.service;

import web.entity.Car;

import java.util.List;

public interface CarService {

    List<Car> showCars(int carCount);

}
