package geekbrains.lesson;

public class Main {
    public static void main(String[] args) {


        String[][] arr = {
                {"10", "20", "30", "40"},
                {"50", "60", "70", "80"},
                {"90", "10", "11", "3"},
                {"13", "14", "15", "34"}
        };
        try {
            ArrOfNumbers.ArrOfNumbers(arr);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable t) {
        }
    }
}
