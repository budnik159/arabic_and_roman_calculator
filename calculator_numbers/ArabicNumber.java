package com.calculator.calculator_numbers;

public class ArabicNumber extends BaseNumber {

    public ArabicNumber(String value) {
        super(value);
    }

    @Override
    public BaseNumber sum(BaseNumber number) {
        int first = Integer.parseInt(value);
        int second = Integer.parseInt(number.value);
        int sum = first + second;
        return new ArabicNumber(String.valueOf(sum));
    }

    @Override
    public BaseNumber subtract(BaseNumber number) {
        int first = Integer.parseInt(value);
        int second = Integer.parseInt(number.value);
        int subtract = first - second;
        return new ArabicNumber(String.valueOf(subtract));
    }

    @Override
    public BaseNumber multiplication(BaseNumber number) {
        int first = Integer.parseInt(value);
        int second = Integer.parseInt(number.value);
        int multiplication = first*second;
        return new ArabicNumber(String.valueOf(multiplication));
    }

    @Override
    public BaseNumber divide(BaseNumber number) {
        int first = Integer.parseInt(value);
        int second = Integer.parseInt(number.value);
        double divide = 0;
        try {
           divide = (double)first/second;
           return new ArabicNumber(String.valueOf(divide));
        } catch (Exception exc){
            exc.printStackTrace();
        }
        return null;
    }


}