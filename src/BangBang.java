import java.util.Scanner;

public class BangBang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean[] isAlive = new boolean[n];

        for (int i = 0; i < n; i++) {
            isAlive[i] = true;
        }

        while (true){
            for (int i = 0; i < n; i++) {
                if (isAlive[i]){
                    int j = 0;

                    do{
                        j++;
                        if (i + j == n){
                            j = -i;
                        }
                    }
                    while (!isAlive[i + j]);

                    if (j == i){
                        System.out.println(j + 1);
                        System.exit(0);
                    }

                    isAlive[i + j] = false;

                }
            }
        }

    }

    private static boolean notDone(boolean[] isAlive) {
        for (int i = 0; i < 2; i++) {

        }
        return true;
    }
}
