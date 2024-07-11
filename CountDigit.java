import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product:");
        int product = sc.nextInt();
        int count = 0;
        while (product > 0) {
            int lastDigit = product % 10;
            System.out.println(lastDigit);
            count++;
            product = product / 10;
        }
        System.out.println("Number of digits: " + count);
    }
}
