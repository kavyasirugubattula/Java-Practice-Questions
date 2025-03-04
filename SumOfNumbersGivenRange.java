import java.util.Scanner;

public class SumOfNumbersGivenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter a number: ");
        int b = sc.nextInt();
        for(int i=a;i<=b;i++)
            System.out.println(i);
    }
}
