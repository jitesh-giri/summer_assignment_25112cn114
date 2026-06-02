import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reversed = 0;
        int temp = num;

        // Reverse the number
        while (temp != 0) {
            int digit = temp % 10;             // extract last digit
            reversed = reversed * 10 + digit;  // build reversed number
            temp /= 10;                        // remove last digit
        }

        // Check palindrome
        if (num == reversed) {
            System.out.println(num + " is a Palindrome.");
        } else {
            System.out.println(num + " is NOT a Palindrome.");
        }

        sc.close();
    }
}
