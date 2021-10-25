package Done;

import java.util.Scanner;

public class SeVer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long ans = n *  ((long) Math.pow(10, n - 1));

        System.out.println(ans);
    }
}
