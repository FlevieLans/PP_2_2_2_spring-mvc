package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.Optional;


@Controller
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) { this.carService = carService; }

    @GetMapping("/cars")
    public String showCar(@RequestParam(value = "count", defaultValue = "5") Optional<Integer> carCount, Model model) {
        model.addAttribute("cars", carService.showCars(carCount.orElse(0)));
        return "cars";
    }

}