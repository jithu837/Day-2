import java.util.Scanner;

class Fitness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int X = scanner.nextInt(); 
            int totalKilometers = 2 * X * 5;
            System.out.println(totalKilometers);
        }

        scanner.close();
    }
}
