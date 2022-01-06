package com.teachMeSkills.lesson_10.task1;

import com.teachMeSkills.lesson_10.task1.exception.IsExistsABCException;
import com.teachMeSkills.lesson_10.task1.exception.isExist1a2bException;
import com.teachMeSkills.lesson_10.task1.exception.isExist555Exception;

class NumDoc {

    // Вывести на экран в одну строку два первых блока по 4 цифры
    static String getNumb(String st) {

        st = st.substring(0, 4) + " " + st.substring(9, 13);
        return st;

    }

    //Вывести на экран номер документа, но блоки из трех букв заменить на (каждая буква заменятся на )
    static String changeLetter(String st) {

        //разница между replace replaceAll??
        st = st.replace("Y", "y").
                replace("R", "r").
                replace("t", "T").
                replace("r", "R").
                replace("N", "n").
                replace("f", "F");
        return st;

    }

    // Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре
    static String changeFormat(String st) {

        st = (st.substring(5, 8) + "/" + st.substring(14, 17) + "/" +
                st.substring(19, 20) + "/" + st.substring(21)).toLowerCase();
        return st;

    }

    //Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder)
    static String changeFormatSB(StringBuilder st) {
        return (st.substring(5, 8) + "/" + st.substring(14, 17) + "/" + st.substring(19, 20) + "/" + st.substring(21)).toUpperCase();
    }

    //Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью)
    static String isContainABC(String st) throws IsExistsABCException {

        st = st.toUpperCase();
        if (st.contains("ABC")) {
            return "Yes, it contains ABC";
        } else {
            throw new IsExistsABCException(st + " doesn't contain ABC");
        }

    }

    //Проверить начинается ли номер документа с последовательности 555.
    static String isStart(String st) throws isExist555Exception {

        if (st.startsWith("555")) {
            return "Yes, it starts with 555";
        } else {
            throw new isExist555Exception(st + " doesn't start with 555");
            // return "No, it doesn't start with 555";
        }

    }

    //Проверить заканчивается ли номер документа на последовательность 1a2b.
    static String isEnd(String st) throws isExist1a2bException {

        if (st.endsWith("1a2b")) {
            return "Yes, it ends with 1a2b";
        } else {
            throw new isExist1a2bException(st + " doesn't end with 1a2b");
            //return "No, it doesn't end with 1a2b";
        }

    }
}
