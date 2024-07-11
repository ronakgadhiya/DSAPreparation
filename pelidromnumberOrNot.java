
import java.util.Scanner;

public class pelidromnumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product : ");
        int product = sc.nextInt();
        int actualNumber = product;
        int reverse = 0;
        while (product > 0) {
            int lastDigit = product % 10;
            reverse = (reverse * 10) + lastDigit;
            product = product / 10;
        }

        if(reverse == actualNumber){
            System.out.println("this Number is pelidrom number...");
        }else{
            System.out.println("this number is not pelidrom number");
        }
    }
}
