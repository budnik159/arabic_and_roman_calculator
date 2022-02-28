package com.calculator.calculator_util;

import com.calculator.FactoryOperation;
import com.calculator.IOperation;
import com.calculator.NumberFactory;
import com.calculator.calculator_exception.*;
import com.calculator.calculator_numbers.BaseNumber;

import java.util.*;

public class Util {

    public static BaseNumber splitExpression(String expression) throws BaseException {
        int operationPosition = 0;
        for (Character operation : IOperation.operationTypes) {
            operationPosition = expression.indexOf(operation);
            if (operationPosition != -1) {
                String firstOperand = expression.substring(0, operationPosition);
                String secondOperand = expression.substring(operationPosition + 1);
                String operationType = expression.substring(operationPosition, operationPosition + 1);

                BaseNumber firstNumber = NumberFactory.createNumber(firstOperand);
                BaseNumber secondNumber = NumberFactory.createNumber(secondOperand);
                IOperation operation1 = FactoryOperation.create(operationType);
                if (!operation1.checkOperandsType(firstNumber, secondNumber)) {
                    throw new NumberException("В выражении указаны различные типы операндов");
                }
                BaseNumber result = operation1.makeOperation(firstNumber, secondNumber);
                return result;
            }
        }
        throw new ForbiddenOperationException("Несуществующая операция");
    }

    public static int convertToArab(String roman) throws ConvertException {
        HashMap<String, Integer> romanToArab = BaseNumber.romanToArab;
        int arab = romanToArab.getOrDefault(roman, -1);
        if (arab == -1) {
            throw new ConvertException();
        } else {
            return arab;
        }
    }

    public static String convertToRoman(int arab) throws LimitException {
        if (arab > 100 || arab < 1) {
            throw new LimitException();
        }

        int tens = arab / 10;
        int ost = arab - 10 * tens;
        String result = "";
        switch (tens) {
            case 1: {
                result = "X";
                break;
            }
            case 2: {
                result = "XX";
                break;
            }
            case 3: {
                result = "XXX";
                break;
            }
            case 4: {
                result = "XL";
                break;
            }
            case 5: {
                result = "L";
                break;
            }
            case 6: {
                result = "LX";
                break;
            }
            case 7: {
                result = "LXX";
                break;
            }
            case 8: {
                result = "LXXX";
                break;
            }
            case 9: {
                result = "XC";
                break;
            }
            case 10: {
                result = "C";
                break;
            }
        }

        return result + BaseNumber.arabToRoman.get(ost);
    }

}

