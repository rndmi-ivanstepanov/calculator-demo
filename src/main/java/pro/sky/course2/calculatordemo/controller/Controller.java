package pro.sky.course2.calculatordemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.course2.calculatordemo.service.SimpleOperations;

@RestController
@RequestMapping("/calculator")
public class Controller {
    private final SimpleOperations simpleOperations;

    public Controller(SimpleOperations simpleOperations) {
        this.simpleOperations = simpleOperations;
    }

    @GetMapping
    public String greetings() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(Integer num1, Integer num2) {
        return simpleOperations.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(Integer num1, Integer num2) {
        return simpleOperations.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(Integer num1, Integer num2) {
        return simpleOperations.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(Integer num1, Integer num2) {
        return simpleOperations.divide(num1, num2);
    }
}
