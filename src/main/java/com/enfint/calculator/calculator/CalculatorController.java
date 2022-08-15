package com.enfint.calculator.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/add/{first_number}/{second_number}")
    public Calculator add(@PathVariable double first_number, @PathVariable double second_number){
        return new Calculator(first_number, second_number, first_number+second_number);
    }

    @GetMapping("/subtract/{first_number}/{second_number}")
    public Calculator subtract(@PathVariable double first_number, @PathVariable double second_number){
        return new Calculator(first_number, second_number, first_number-second_number);
    }

    @GetMapping("/multiply/{first_number}/{second_number}")
    public Calculator multiply(@PathVariable double first_number, @PathVariable double second_number){
        return new Calculator(first_number, second_number, first_number*second_number);
    }

    @GetMapping("/divide/{first_number}/{second_number}")
    public Calculator divide(@PathVariable double first_number, @PathVariable double second_number){
        return new Calculator(first_number, second_number, first_number/second_number);
    }
}
