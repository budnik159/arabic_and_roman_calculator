package com.calculator;

import com.calculator.calculator_exception.ForbiddenOperationException;

public class FactoryOperation {
    public static IOperation create(String operation) throws ForbiddenOperationException {
        switch (operation){
            case "+" : {
                return new Addition();
            }
            case "-" : {
                return new Subtraction();
            }
            case "*" : {
                return new Multiplication();
            }
            case "/" : {
                return new Division();
            }
        }
        throw new ForbiddenOperationException("Несуществующая операция");
    }
}

