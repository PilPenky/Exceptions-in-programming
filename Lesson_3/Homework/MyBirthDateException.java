package Lesson_3.Homework;

public class MyBirthDateException extends IllegalArgumentException{
    public MyBirthDateException(String dateBirt) {
        super("Ошибка! Не правильно указана дата рождения: " + dateBirt);
    }
}