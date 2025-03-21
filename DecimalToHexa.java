import java.util.Scanner;

public class DecimalToHexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        char hexa[] = new char[30];
        int i = 0;
        while (a > 0) {
            int remainder = a % 16;
            if (remainder < 10) {
                hexa[i] = (char) ('0' + remainder);
            } else {
                hexa[i] = (char) ('A' + (remainder - 10));
            }
            a /= 16;
            i++;
        }
        System.out.print("The hexadecimal number is: ");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(hexa[j]);
        }
    }
}
