import java.util.*;

public class Intro {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int age;
        String name;

        System.out.print("나이를 입력하세요: ");
        age = input.nextInt();

        System.out.print("이름을 입력하세요: ");
        name = input.next();

        System.out.printf("제 나이는 %d 이고 제 이름은 %s 입니다.", age, name);
    }
}