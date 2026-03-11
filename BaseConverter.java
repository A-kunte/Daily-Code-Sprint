import java.util.Scanner;

public class BaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Decimal to Binary Logic ---");
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        if (decimal == 0) {
            System.out.println("Binary: 0");
        } else {
            String binary = "";
            int temp = decimal;

            while (temp > 0) {
                int remainder = temp % 2;
                binary = remainder + binary;
                temp = temp / 2;
            }

            System.out.println("✅ Decimal: " + decimal);
            System.out.println("✅ Binary equivalent: " + binary);
        }

        System.out.println("🔍 Verification (Built-in): " + Integer.toBinaryString(decimal));

        sc.close();
    }
}