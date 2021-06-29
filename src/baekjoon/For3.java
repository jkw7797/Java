// 합 (1~N까지 합구하기)
import java.util.Scanner;

public class For3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.close();
        int sum=0;
        
        for(int i=1; i<=n; i++){
           sum = sum + i;
        }
        System.out.println(sum);
    }
}