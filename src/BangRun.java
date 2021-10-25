import java.util.Scanner;

public class BangRun {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int killer = n - 1;
        for (int index = 0 ; index < n ; index++){
            arr[index] = 0;
        }
        int num = n;
        while(num != 1){
            int ne = (killer  + 1)% n;
            while (arr[ne] == 1){
                ne = (ne + 1 )% n;
            }
            killer = ne;
            int dead = (killer + 1)%n;
            while (arr[dead] == 1){
                dead = (dead + 1)%n;
            }
            arr[dead] = 1;
            num--;
        }
        System.out.println(killer%n + 1);
    }
}