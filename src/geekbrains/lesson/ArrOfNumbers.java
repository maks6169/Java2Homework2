package geekbrains.lesson;

public class ArrOfNumbers {
    public  ArrOfNumbers(){
    String[][] arr = {
            {"10", "20", "30", "40"},
            {"50", "60", "70", "80"},
            {"90", "10", "11", "12"},
            {"13", "14", "15", "34"}
    };
      new MyArraySizeException().ArraySizeException(arr);
        for (int i = 0; i <arr.length ; i++) {
        for (int j = 0; j <arr[i].length; j++) {
            Integer.parseInt(arr[i][j]);
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }

}
}
