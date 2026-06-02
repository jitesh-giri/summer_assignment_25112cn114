import java.util.Scanner;

public class question6{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reversed = 0;
        int temp = num;

        // Logic: extract digits and build reversed number
        while (temp != 0) {
            int digit = temp % 10;          // get last digit
            reversed = reversed * 10 + digit; // append digit
            temp /= 10;                     // remove last digit
        }

        // Output
        System.out.println("Reversed number = " + reversed);

        sc.close();
    }
}
