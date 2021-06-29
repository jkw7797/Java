import java.util.Scanner;

//사분면
public class If4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("x:");
        int x = scan.nextInt();
        System.out.println("y:");
        int y = scan.nextInt();
        if(x > 0){
            if(y>0){
                System.out.println(1);
            }else{
                System.out.println(4);
            }
        }else{
            if(y>0){
                System.out.println(2);
            }else{
                System.out.println(3);
            }
        }
        scan.close();
    }
}
