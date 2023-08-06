package Lesson_3.Homework;

public class MyGenderException extends IllegalArgumentException{
    public MyGenderException(String maleOrFamale) {
        super("Ошибка! Не правильно указан пол: " + maleOrFamale);
    }
}