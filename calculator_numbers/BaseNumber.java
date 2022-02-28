package com.calculator.calculator_numbers;

import java.util.HashMap;

public abstract class BaseNumber {
    protected String value;
    public static HashMap<String, Integer> romanToArab = new HashMap(){{
        put("I", 1);
        put("II", 2);
        put("III", 3);
        put("IV", 4);
        put("V", 5);
        put("VI", 6);
        put("VII", 7);
        put("VIII", 8);
        put("IX", 9);
        put("X", 10);
    }};

 public static HashMap<Integer, String> arabToRoman = new HashMap(){{
        put(1, "I");
        put(2, "II");
        put(3, "III");
        put(4, "IV");
        put(5, "V");
        put(6, "VI");
        put(7, "VII");
        put(8, "VIII");
        put(9, "IX");
        put(10, "X");
        put(0, "");
    }};

    public BaseNumber(String value){
        this.value = value;
    }

    public abstract BaseNumber sum(BaseNumber number);
    public abstract BaseNumber subtract(BaseNumber number);
    public abstract BaseNumber multiplication(BaseNumber number);
    public abstract BaseNumber divide(BaseNumber number);

    public String getValue(){
        return value;
    }
}
