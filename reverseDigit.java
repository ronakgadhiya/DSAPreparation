
import java.util.Scanner;

public class reverseDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product Digit");
        int product = sc.nextInt();
        int reverse = 0;
        while (product > 0) {
            int lastDigit = product % 10;
            product = product / 10;
            reverse = (reverse * 10) + lastDigit;
        }
        System.out.println("Reverse Digit is :" + reverse);
    }
}
