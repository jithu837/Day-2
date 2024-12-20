import java.util.Scanner;

class BiryaniClasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int X = scanner.nextInt(); 
            int Y = scanner.nextInt(); 
            int totalCost = X * Y;
            System.out.println(totalCost);
        }
        scanner.close();
    }
}
