package Lesson_3.Example4;

public class Main {
    public static void main(String[] args) {
        String[][] testArray = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};
        try {
            System.out.println(arraySumOfElements(testArray));
        } catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }

    public static int arraySumOfElements(String[][] arr){
        int res = 0;
        int desired = 4;
        if (arr.length != desired){
            throw new MyArraySizeException("Desired array length: " + desired + ". Current length: " + arr.length);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != desired){
                throw new MyArraySizeException("Desired array length: " + desired + ". Current length: " + arr[i].length);
            }
            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j].matches("[0-9]+")){
//                    throw new MyArrayDataException();
//                }
                try {
                    res += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return res;
    }
}