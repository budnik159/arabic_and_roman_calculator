package com.calculator.calculator_exception;

public class ForbiddenOperationException extends BaseException {
    public ForbiddenOperationException(String message){
        super(message);
    }

    public ForbiddenOperationException(){
        super();
    }


}
