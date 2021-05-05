package geekbrains.lesson;

public class MyArraySizeException extends RuntimeException {
    public void ArraySizeException(String[][] arr) {
        if (arr.length != 4) {
            System.out.println("MyArraySizeException");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                System.out.println("MyArraySizeException");
                break;
            }
        }
    }
}