package geekbrains.lesson;

public class ArrOfNumbers {
    public static int ArrOfNumbers(String[][] arr) {
        int sum = 0;
        new MyArraySizeException().ArraySizeException(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("Not a number [%d][%d]", i + 1, j + 1));
                }
            }
        }
        System.out.println("Sum is " + sum);
        return sum;
    }
}