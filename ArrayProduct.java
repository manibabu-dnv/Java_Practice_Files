import java.util.Scanner;

// Functional interface for calculating product
interface ProductCalculator {
    long calculateProduct(int[] array);
}

public class ArrayProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // Input array elements
        String[] elements = scanner.nextLine().split(" ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(elements[i]);
        }

        // Lambda expression to calculate product
        ProductCalculator productCalculator = (arr) -> {
            long product = 1;
            for (int num : arr) {
                product *= num;
            }
            return product;
        };

        // Calculate and print the product
        System.out.println(productCalculator.calculateProduct(array));
        scanner.close();
    }
}
