package com.enfint.calculator.calculator.controller;

import com.enfint.calculator.calculator.model.Calculator;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class CalculatorController {

    @GetMapping("/add/{first_number}/{second_number}")
    public double add(@PathVariable double first_number, @PathVariable double second_number){
        return new Calculator(first_number, second_number, first_number+second_number).getResult();
    }

    @GetMapping("/subtract/{first_number}/{second_number}")
    public double subtract(@PathVariable double first_number, @PathVariable double second_number){
        return new Calculator(first_number, second_number, first_number-second_number).getResult();
    }

    @GetMapping("/multiply/{first_number}/{second_number}")
    public double multiply(@PathVariable double first_number, @PathVariable double second_number){
        return new Calculator(first_number, second_number, first_number*second_number).getResult();
    }

    @GetMapping("/divide/{first_number}/{second_number}")
    public double divide(@PathVariable double first_number, @PathVariable double second_number){
        try{
            return new Calculator(first_number, second_number, first_number/second_number).getResult();
        }catch (ArithmeticException e){ //cannot divide by zero
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Cannot divide by zero!",e);
        }

    }
}
