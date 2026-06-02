import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        int temp = num;

        // Logic: extract digits and add
        while (temp > 0) {
            int digit = temp % 10;   // get last digit
            sum += digit;            // add to sum
            temp /= 10;              // remove last digit
        }

        // Output
        System.out.println("Sum of digits of " + num + " = " + sum);

        sc.close();
    }
}
