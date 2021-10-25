import java.util.Scanner;

public class Srkari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        if (a == 0 && b != 0){
            System.out.println("WHITE");
        }
        else if(b == 0 && a != 0){
            System.out.println("BLACK");
        }
        else {
            System.out.println("ONLY GOD KNOWS");
        }

    }
}
