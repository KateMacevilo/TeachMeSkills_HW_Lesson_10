package com.teachMeSkills.lesson_10.task2.exception;

public class WrongLoginException extends Exception {

    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
