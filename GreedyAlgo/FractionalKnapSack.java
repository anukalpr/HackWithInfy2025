import java.util.Arrays;
import java.util.Scanner;

public class FractionalKnapSack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int m = sc.nextInt(); 

        double[][] arr = new double[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextDouble();
            }
        }

        double truckSize = sc.nextDouble(); 

        Arrays.sort(arr, (a, b) -> Double.compare(b[0] / b[1], a[0] / a[1]));

        double totalValue = 0.0;

        for (int i = 0; i < arr.length && truckSize > 0; i++) {
            double value = arr[i][0];
            double weight = arr[i][1];

            if (truckSize >= weight) {
                totalValue += value;
                truckSize -= weight;
            } else {
                totalValue += value * (truckSize / weight);
                truckSize = 0;
            }
        }

        System.out.printf("%.2f\n", totalValue); 
    }
}
