package Lesson_3.Example4;

public class MyArrayDataException extends IllegalArgumentException{
    public MyArrayDataException(int i, int j) {
        super("The problematic element by the [" + i + "], [" + j + "] index");
    }
}