package bg.pragmatic.resthomework.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorRestController {
    @GetMapping("/add")
    public  double add(@RequestParam("number1") double number1, @RequestParam("number2") double number2 ){
        return number1+number2;
    }
    @GetMapping("/multiply")
    public  double multiply(@RequestParam("number1") double number1, @RequestParam("number2") double number2 ){
        return number1*number2;
    }
    @GetMapping("/divide")
    public double divide(@RequestParam("number1") double number1, @RequestParam("number2") double number2 ){
            return number1 / number2;
    }
    @GetMapping("/subtract")
    public  double subtract(@RequestParam("number1") double number1, @RequestParam("number2") double number2 ){
        return number1-number2;
    }
}
