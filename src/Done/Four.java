package Done;

import java.util.Scanner;

public class Four {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long ans = 1 + ((n) * (n + 1)) / 2;
        System.out.println(ans);
    }




}
