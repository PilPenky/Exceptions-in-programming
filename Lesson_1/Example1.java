package Lesson_1;
/*
Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
Если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки, иначе - длину массива.
 */
public class Example1 {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,6,4};
        System.out.println(checkLength(arr));
    }

    static int checkLength(int[] arr){
        int minLength = 5;
        if (arr.length < minLength){
            return -1;
        }
        return arr.length;
    }
}
