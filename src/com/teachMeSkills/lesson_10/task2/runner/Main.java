package com.teachMeSkills.lesson_10.task2.runner;

import com.teachMeSkills.lesson_10.task2.autorization.Authorization;
import com.teachMeSkills.lesson_10.task2.exception.WrongInputException;
import com.teachMeSkills.lesson_10.task2.exception.WrongLoginException;
import com.teachMeSkills.lesson_10.task2.exception.WrongPasswordException;

import java.util.Scanner;

/**
 * Создать класс, в котором будет статический метод.
 * (почитать и понять, чем статический метод отличается от нестатического - обсудить на занятии по необходимости)
 * Этот метод принимает на вход три параметра:
 * login
 * password
 * confirmPassword
 * <p>
 * Все поля имеют тип данных String.
 * Длина login должна быть меньше 20 символов и не должен содержать пробелы.
 * Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
 * Длина password должна быть меньше 20 символов, не должен содержать пробелом и должен содержать хотя бы одну цифру.
 * Также password и confirmPassword должны быть равны.
 * Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
 * WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами
 * – один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
 * Метод возвращает true, если значения верны или false в другом случае.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean authorize = false;
        String login;
        String password;
        String confirmPassword;

        while (!authorize) {
            System.out.println("Введите логин: ");
            login = scanner.nextLine();

            System.out.println("Введите пароль: ");
            password = scanner.nextLine();

            System.out.println("Подтердите пароль: ");
            confirmPassword = scanner.nextLine();

            try {
                if (Authorization.checkLoginPassword(login, password, confirmPassword)) {
                    System.out.println("Вы зарегистрированы!");
                    authorize = true;
                }
            } catch (WrongLoginException e1) {
                System.out.println("Неверный логин: " + e1.getMessage());
                System.out.println();
            } catch (WrongPasswordException e2) {
                System.out.println("Неверный пароль: " + e2.getMessage());
                System.out.println();
            } catch (WrongInputException e3) {
                System.out.println(e3.getMessage());
            }
        }
    }


}
