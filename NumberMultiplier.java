import java.util.Scanner;

public class NumberMultiplier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int numberfirst = sc.nextInt();
        System.out.print("Enter second number : ");
        int numbersecond = sc.nextInt();
        int product = numberfirst * numbersecond;
        System.out.println(product + "\n");
        

    }
}