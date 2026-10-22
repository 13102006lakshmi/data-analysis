
public class DataAnalysis {
    public static void main(String[] args) {

        int[] data = {10, 20, 30, 40, 50};

        int sum = 0;
        int max = data[0];
        int min = data[0];

        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];

            if (data[i] > max) {
                max = data[i];
            }

            if (data[i] < min) {
                min = data[i];
            }
        }

        double average = (double) sum / data.length;

        System.out.println("Data Analysis");
        System.out.println("Total = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
