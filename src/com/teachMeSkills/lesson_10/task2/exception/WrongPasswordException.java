package com.teachMeSkills.lesson_10.task2.exception;

public class WrongPasswordException extends Exception{

    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
