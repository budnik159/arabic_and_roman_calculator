package com.calculator.calculator_numbers;

import com.calculator.calculator_exception.BaseException;
import com.calculator.calculator_exception.ConvertException;
import com.calculator.calculator_exception.ForbiddenOperationException;
import com.calculator.calculator_util.Util;

public class RomanNumber extends BaseNumber {


    public RomanNumber(String value) {
        super(value);
    }

    @Override
    public BaseNumber sum(BaseNumber number) {
        try {
            //TODO: вынести общий код в функцию и туда передавать операцию
            int sum = computation(number, "+");
            String roman = Util.convertToRoman(sum);
            return new RomanNumbers(roman);
        } catch (BaseException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public BaseNumber subtract(BaseNumber number) {
        try {
            int subtract = computation(number, "-");
            String roman = Util.convertToRoman(subtract);
            return new RomanNumbers(roman);
        } catch (BaseException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public BaseNumber multiplication(BaseNumber number) {
        try {
            int multiplication = computation(number, "*");
            String roman = Util.convertToRoman(multiplication);
            return new RomanNumbers(roman);
        } catch (BaseException e) {
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public BaseNumber divide(BaseNumber number) {
        try {
            int divide = computation(number, "/");;
            String roman = Util.convertToRoman(divide);
            return new RomanNumbers(roman);
        } catch (BaseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int computation(BaseNumber number, String operation) throws BaseException {

        int arab1 = Util.convertToArab(value);
        int arab2 = Util.convertToArab(number.value);
        switch (operation) {
            case "+": {
                return arab1 + arab2;
            }
            case "-": {
                return arab1 - arab2;
            }
            case "*": {
                return arab1 * arab2;
            }
            case "/": {
                return arab1 / arab2;
            }
            default:
                throw new ForbiddenOperationException();
        }

    }

}
