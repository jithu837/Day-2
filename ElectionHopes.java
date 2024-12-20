import java.util.Scanner;

class ElectionHopes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of votes for Chef and Chefu
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        // Check if Chef dominated the election
        if (X >= 2 * Y) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
