import java.util.Scanner;

public class SumofFirstNnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = scanner.nextInt();
        int sum = 0;
        for(int i=0;i<=a;i++){
            System.out.println(i + " ");
            sum +=i;
        }
        System.out.println("Sum of first N natural numbers: " + sum);
    }
}
