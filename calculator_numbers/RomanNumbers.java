package com.calculator.calculator_numbers;

import com.calculator.calculator_util.Util;

public class RomanNumbers extends BaseNumber {


    public RomanNumbers(String value) {
        super(value);
    }

    @Override
    public BaseNumber sum(BaseNumber number) {
        try {
            int arab1 = Util.convertToArab(value);
            int arab2 = Util.convertToArab(number.value);
            int sum = arab1 + arab2;
            String roman = Util.convertToRoman(sum);
            return new RomanNumbers(roman);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public BaseNumber subtract(BaseNumber number) {
        try {
            int arab1 = Util.convertToArab(value);
            int arab2 = Util.convertToArab(number.value);
            int subtract = arab1 - arab2;
            String roman = Util.convertToRoman(subtract);
            return new RomanNumbers(roman);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public BaseNumber multiplication(BaseNumber number) {
        try {
            int arab1 = Util.convertToArab(value);
            int arab2 = Util.convertToArab(number.value);
            int multiplication = arab1*arab2;
            String roman = Util.convertToRoman(multiplication);
            return new RomanNumbers(roman);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public BaseNumber divide(BaseNumber number) {
        try {
            int arab1 = Util.convertToArab(value);
            int arab2 = Util.convertToArab(number.value);
            int divide = arab1/arab2;
            String roman = Util.convertToRoman(divide);
            return new RomanNumbers(roman);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
