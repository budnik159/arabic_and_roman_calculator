package com.calculator.calculator_exception;

public class ConvertException extends BaseException{

    public ConvertException(String message){
        super(message);
    }

    public ConvertException(){
        super("Ошибка конвертации");
    }
}
