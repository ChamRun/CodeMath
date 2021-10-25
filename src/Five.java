import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        long c = facto(a, b);

        System.out.println(c + " -> c");

        c %= (1000000007);

        int count = 0;

        for (int i = 1; i < c / 2 + 2; i++) {
            if (c % i == 0){
                count++;
            }
        }

        System.out.println(count);
    }

    private static long facto(long n, long m) {
        System.out.println("n: " + n + "\nm: " + m);
        long ans = 1;

        for (long i = n + 1; i <= m; i++) {
            ans *= i;
            System.out.println("i: " + i);
            //System.out.println(ans + "-> ans");
        }


        return ans;

    }
}
