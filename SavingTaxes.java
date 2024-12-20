import java.util.Scanner;

class SavingTaxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of test cases
        int T = scanner.nextInt();

        // Iterate over each test case
        for (int i = 0; i < T; i++) {
            int X = scanner.nextInt(); // Income earned
            int Y = scanner.nextInt(); // Tax threshold

            // Calculate the minimum investment needed
            int minimumInvestment = X - Y;

            // Output the result
            System.out.println(minimumInvestment);
        }

        scanner.close();
    }
}
