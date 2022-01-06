package com.teachMeSkills.lesson_10.task1;

import com.teachMeSkills.lesson_10.task1.exception.IsExistsABCException;
import com.teachMeSkills.lesson_10.task1.exception.isExist1a2bException;
import com.teachMeSkills.lesson_10.task1.exception.isExist555Exception;

/**
 * Исключения:
 * Добработать нулевое домашнее задание предыдущего урока.
 * Теперь надо создать свои классы исключений на каждую ситуацию:
 * - Проверить содержит ли номер документа последовательность abc.
 * - Проверить начинается ли номер документа с последовательности 555.
 * - Проверить заканчивается ли номер документа на последовательность 1a2b.
 * <p>
 * Если номер документа не удовлетворяет условию - то "бросить" исключение.
 * В методе класса, в котором будут вызываться эти методы для демонстрации работы,
 * перехватить исключение конструкцией try-catch и в блоке catch вывести сообщение для пользователя(сообщение на консоль).
 */
public class Main {

    public static void main(String[] args) {

        String numDoc = "5254-YNt-0009-rYN-112b";
        StringBuilder sbNum = new StringBuilder("5764-YNt-0009-rYN-4f9t");

        System.out.println(NumDoc.getNumb(numDoc));
        System.out.println(NumDoc.changeLetter(numDoc));
        System.out.println(NumDoc.changeFormat(numDoc));
        System.out.println("Letters:" + NumDoc.changeFormatSB(sbNum));

        try {
            System.out.println(NumDoc.isContainABC(numDoc));
        } catch (IsExistsABCException e) {
            System.out.println("Исключение " + e.getClass().getSimpleName() + " " + e.getMessage());
        }

        try {
            System.out.println(NumDoc.isStart(numDoc));
        } catch (isExist555Exception e) {
            System.out.println("Исключение " + e.getClass().getSimpleName() + " " + e.getMessage());
        }

        try {
            System.out.println(NumDoc.isEnd(numDoc));
        } catch (isExist1a2bException e) {
            System.out.println("Исключение " + e.getClass().getSimpleName() + " " + e.getMessage());
        }

    }

}
