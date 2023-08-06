package Lesson_3.Example3;
/*
    Создайте класс исключения, который будет выбрасываться при делении на 0.
    Исключение должно отображать понятное для пользователя сообщение об ошибке.
 */

public class Main {
    public static void main(String[] args) {
        try {
            double res = divideTwo(6, 0);
            System.out.println(res);
        } catch (DivisionByZeroException e){
            e.printStackTrace();
        }
    }

    public static double divideTwo(int num1, int num2){
        if (num2 == 0){
            throw new DivisionByZeroException("You can't divide by zero!");
        }
        return num1/num2;
    }
}
