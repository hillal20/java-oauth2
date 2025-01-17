package com.lambdaschool.oauth2.exceptions;

public class ValidationError {
 private  String code;
 private String message;




    ////////////////////////  constructors
    public ValidationError(String code, String message) {
        this.code = code;
        this.message = message;
    }
    //////////////////////// default  constructors is a  must in java spring
    public ValidationError() {
    }

    /////////////////////// setters and getters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    //////////// toString method
    @Override
    public String toString() {
        return "ValidationError{" + "code='" + code + '\'' + ", message='" + message + '\'' + '}';
    }
}
