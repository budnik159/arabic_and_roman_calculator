package com.calculator;

import com.calculator.calculator_numbers.BaseNumber;

import java.util.Arrays;
import java.util.List;

public interface IOperation {
    List<Character> operationTypes = Arrays.asList('+', '-', '*', '/');

    BaseNumber makeOperation(BaseNumber a, BaseNumber b);

    default boolean checkOperandsType(BaseNumber a, BaseNumber b){

        return b.getClass().equals(a.getClass());
    }
}
