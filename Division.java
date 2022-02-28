package com.calculator;

import com.calculator.calculator_numbers.BaseNumber;

public class Division implements IOperation{

    @Override
    public BaseNumber makeOperation(BaseNumber a, BaseNumber b) {
        return a.divide(b);
    }
}
