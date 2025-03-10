import java.util.Scanner;

public class PowerofNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a power: ");
        int a = 4;
        int b = sc.nextInt();
        double result = Math.pow(a, b);
        System.out.println("The number is " + result);
    }
}
