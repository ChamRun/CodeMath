import java.util.Scanner;

public class Radical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        double k = sc.nextLong();

        double ans = Math.pow(n, 1 / k);

        System.out.println(String.format("%.6f", ans));
    }
}
