package Lesson_1.Homework.Example1;

/*
Реализуйте 3 метода, чтобы в каждом из них получить разные исключения:

Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива
Метод divisionByZero - Деление на 0
Метод numberFormatException - Ошибка преобразования строки в число
*/
class Answer {
    public static void arrayOutOfBoundsException() {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5};
        arr[10] = 7;
    }

    public static void divisionByZero() {
        int num = 5 / 0;
    }

    public static void numberFormatException() {
        String str = "haha";
        int numStr = Integer.parseInt(str);
    }
}
