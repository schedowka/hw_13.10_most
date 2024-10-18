import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int busHight = 437;
        int bridgeHight;
        for (int i = 1; i<=n; i++) {
            bridgeHight = scanner.nextInt();
            if (bridgeHight <= busHight) {
                System.out.print("crah " + i);
                return;

            }
        }
            System.out.println("no crash");
        }



}