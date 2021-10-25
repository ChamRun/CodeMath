package Done;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long ans = (long) Math.pow(2, n);
        System.out.println(ans);
    }
}
