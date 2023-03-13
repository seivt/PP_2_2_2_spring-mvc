package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") String count,
                          Model model) {
        if (!count.matches("[0-5]")) {
            return "cars-exception";
        } else {
            System.out.println("asdvas");
            model.addAttribute("cars", carService.getCars(Integer.parseInt(count)));
            return "cars";
        }


    }
}
