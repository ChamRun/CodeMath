import java.util.Scanner;

public class Berg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] srcs = new int[m];
        int[] dsts = new int[m];


        for (int i = 0; i < m; i++) {
            srcs[i] = sc.nextInt();
            dsts[i] = sc.nextInt();
        }

        for (int i = 0; i < m - 1; i++) {
            if (srcs[i] == dsts[i + 1]){
                i++;
            }
            else {
                System.out.println("Yes");
                System.exit(0);
            }
        }

        System.out.println("No");




    }
}
