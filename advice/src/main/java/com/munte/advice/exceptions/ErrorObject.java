package com.munte.advice.exceptions;

import lombok.Data;

import java.util.Date;

public class ErrorObject {
    public Integer statusCode;
    public String message;
    public Date timestamp;

    public Integer getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
