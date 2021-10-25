package Done;

import java.util.Scanner;

public class Se {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        n = (long) Math.pow(10, n);

        long ans = 0;

        for (int i = 2; i < n; i++) {
            int a = 0;
            long temp_n = i;
            //System.out.println(temp_n + ": temp_n");

            while (0 < temp_n)
            {
                if (temp_n % 10 == 3) {
                    a++;
                }
                temp_n /= 10;
            }

            ans += a;

        }

        System.out.println(ans);
    }
}
