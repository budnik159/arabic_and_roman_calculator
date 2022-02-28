package com.calculator.calculator_main;

import com.calculator.calculator_exception.BaseException;
import com.calculator.calculator_exception.ForbiddenOperationException;
import com.calculator.calculator_numbers.BaseNumber;
import com.calculator.calculator_util.Util;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        while(true) {
            System.out.println("Введите выражение: ");
            Scanner scanner = new Scanner(System.in);
            String expression = scanner.next();

            try {
                BaseNumber baseNumber = Util.splitExpression(expression);
                System.out.println(baseNumber.getValue());
            } catch (BaseException e) {
                e.printStackTrace();
            }
        }


    }
}
