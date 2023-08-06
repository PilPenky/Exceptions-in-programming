package Lesson_3.Homework;

public class MyNumberException extends IllegalArgumentException  {
    public MyNumberException(String numberPhone) {
        super("Ошибка! Не правильно указан номер телефона: " + numberPhone);
    }
}
