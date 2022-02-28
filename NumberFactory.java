package com.calculator;
import com.calculator.calculator_exception.NumberException;
import com.calculator.calculator_numbers.ArabicNumber;
import com.calculator.calculator_numbers.BaseNumber;
import com.calculator.calculator_numbers.RomanNumber;

public class NumberFactory {

    public static BaseNumber createNumber(String number) throws NumberException{
        //TODO: сделать проверку римское или арабское число и создавать нужное

       try {
           if (BaseNumber.romanToArab.containsKey(number)) {
               return new RomanNumber(number);
           } else if (BaseNumber.arabToRoman.containsKey(Integer.parseInt(number))) {
               return new ArabicNumber(number);
           }
       } catch(Exception e){
           throw new NumberException("Несуществующее число");
       }
        throw new NumberException("Несуществующее число");
    }

}


