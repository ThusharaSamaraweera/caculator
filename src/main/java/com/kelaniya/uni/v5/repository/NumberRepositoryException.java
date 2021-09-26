package com.kelaniya.uni.v5.repository;

public class NumberRepositoryException extends Throwable {
    public NumberRepositoryException(Exception e, String message) {
        super(message, e);
    }
}
