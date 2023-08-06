package Lesson_2.Homework;

import java.util.Scanner;

/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
*/
public class HW_Example4 {
    public static void main(String[] args) {
        System.out.printf("Введите строку: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String strRes = str.trim().replaceAll("\\s+", " ");

        if (!strRes.isEmpty()) {
            System.out.println("str = " + strRes);
        } else {
            throw new NullPointerException("Пустые строки вводить нельзя");
        }
    }
}