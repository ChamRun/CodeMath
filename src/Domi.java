import java.util.Scanner;

public class Domi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int ans = 0;

        for (int i = 0; i < n; i++) {
            ans += (facto(n) / facto(n - i));
        }

        System.out.println(ans + 1);

    }



    private static long facto(int n) {
        long ans = 1;

        for (int i = 2; i <= n; i++) {
            ans *= i;
        }

        return ans;

    }


}
