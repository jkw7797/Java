// 기찍 N
import java.util.Scanner;

public class For6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();    
        for (int i = a; i > 0; i--) {
            System.out.println(i);
        }
        scan.close();
    }
}
