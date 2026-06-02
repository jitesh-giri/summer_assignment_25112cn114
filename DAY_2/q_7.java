import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int product = 1;
        int temp = num;

        // Logic: extract digits and multiply
        while (temp > 0) {
            int digit = temp % 10;       // get last digit
            product *= digit;            // multiply with product
            temp /= 10;                  // remove last digit
        }

        // Output
        System.out.println("Product of digits of " + num + " = " + product);

        sc.close();
    }
}
