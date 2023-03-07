import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] arr = {-1.2, 3.4, 5.6, -7.8, 9.0, -2.3,
                4.5, 6.7, -8.9, 10.1, -3.4, 5.6, 7.8, -9.0, 2.3};
        double average = 0.0;
        int count = 0;
        boolean negativeNumb = false;
        for (double num : arr) {
            if (negativeNumb && num > 0) {
                average += num;
                count++;
            } else if (num < 0) {
                negativeNumb = true;

            }

        }
        System.out.println("Среднее арифметическое: " + average / count);



        // ДЗ___2////////////////////

        for (int i = 0; i < arr.length - 1; i++) {
            int minNum = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minNum]) {
                    minNum = j;
                }

            }
            double temp = arr[minNum];
            arr[minNum] = arr[i];
            arr[i] = temp;
            System.out.println(Arrays.toString(arr));
        }
    }
}

