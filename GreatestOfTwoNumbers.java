import java.util.Scanner;

public class GreatestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a First number: ");
        int a = sc.nextInt();
        System.out.print("Enter a second number: ");
        int b = sc.nextInt();
        if(a>b)
            System.out.println("A is Highest number");
        else
            System.out.println("B is Highest number");
    }
}
