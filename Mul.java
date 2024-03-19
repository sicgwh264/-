import java.util.*;

public class Mul {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        int n1, n2;
        int n_100, n_10, n_1;
        System.out.print("세 자릿수 정수 2개: ");
        n1 = input.nextInt();
        n2 = input.nextInt();
        
        n_100 = n2 / 100;
        n_10 = n2 / 10 % 10;
        n_1 = n2 % 100 % 10;

        System.out.println(n1 * n_1);
        System.out.println(n1 * n_10);
        System.out.println(n1 * n_100);
        System.out.println(n1 * n2);
    }
}
