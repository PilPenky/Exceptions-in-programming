package Lesson_2.Homework;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
необходимо повторно запросить у пользователя ввод данных.
    */
public class HW_Example1 {
    public static void main(String[] args) {

        boolean flag = true;
        System.out.printf("Введите число: ");
        while (flag) {
            try {
                Scanner in = new Scanner(System.in);
                Float numFloat = in.nextFloat();

                String strNumFloat = String.valueOf(numFloat);

                if (strNumFloat.matches("[.0-9]+")) {
                    System.out.println("numFloat = " + numFloat);
                    flag = false;
                } else flag = true;

            } catch (InputMismatchException e){
                System.out.printf("Ошибка! Введите число: ");
            }
        }

    }
}