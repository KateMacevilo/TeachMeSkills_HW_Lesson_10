package com.teachMeSkills.lesson_10.task2.autorization;

import com.teachMeSkills.lesson_10.task2.exception.WrongInputException;
import com.teachMeSkills.lesson_10.task2.exception.WrongLoginException;
import com.teachMeSkills.lesson_10.task2.exception.WrongPasswordException;

public class Authorization {

    public static boolean checkLoginPassword(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException, WrongInputException {

        boolean result = false;

        if (login.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            throw new WrongInputException("Нужно заполнить все поля");
        }

        if ((login.length() > 20) || (login.contains(" "))) {
            throw new WrongLoginException("Логин должен быть меньше 20 символов и не должен содержать пробелы ");
        }

        if ((password.length() < 20) || (!password.contains(" "))) {
            if (!password.matches("(.)*(\\d)(.)*")) {
                throw new WrongPasswordException("Пароль должен содержать цифры ");
            }
        } else {
            throw new WrongPasswordException("Пароль должен быть меньше 20 символов и не должен содержать пробелы ");
        }

        if (!confirmPassword.equals(password)) {
            throw new WrongPasswordException("Введенные пароли должны совпадать");
        }

        result = true;

        return result;
    }

}
