package Lesson_3.Homework;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class MyIsEmptyException extends IllegalArgumentException{
    public MyIsEmptyException(Set list) {
        super("Ошибка! Не удалось распознать данные: " + list.toString().replaceAll("^\\[|\\]$", ""));
    }
}