import java.util.Scanner;

public class NumberOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int numberfirst = sc.nextInt();
        System.out.print("Enter second number : ");
        int numbersecond = sc.nextInt();
        int sum = numberfirst+numbersecond;
        int diff = numberfirst-numbersecond;
        int product = numberfirst*numbersecond;
        int quotient = numberfirst/numbersecond;
        int remainder = numberfirst%numbersecond; 
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(product);
        System.out.println(quotient);
        System.out.println(remainder);
    }




    
}
