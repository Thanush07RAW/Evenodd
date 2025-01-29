import java.util.Scanner;

public class Evenodd {
public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        int nval;
        System.out.println("Enter your number: ");
        nval = scanner.nextInt();
        String Result = (nval % 2 == 0) ? "Given number is even" : "Given number is Odd";
        System.out.println(Result);
        }
    }
}
