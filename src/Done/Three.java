package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        ArrayList<Character> chars = new ArrayList<>();
        ArrayList<Integer> n_chars = new ArrayList<>();


        for (char character: s.toCharArray()){

            if (chars.contains(character)){
                int index = chars.indexOf(character);
                n_chars.set(index, n_chars.get(index) + 1);
            }
            else {
                chars.add(character);
                n_chars.add(1);
            }

        }


        long ans = facto(s.length());

        for (int to_dev: n_chars){
            ans /= facto(to_dev);
        }

        System.out.println(ans);
    }

    private static long facto(int n) {
        long ans = 1;

        for (int i = 2; i <= n; i++) {
            ans *= i;
        }

        return ans;

    }


}
