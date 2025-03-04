import java.util.Scanner;

public class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a First number: ");
        int a = sc.nextInt();
        System.out.print("Enter a Second number: ");
        int b = sc.nextInt();
        System.out.print("Enter a Third number: ");
        int c = sc.nextInt();
        if(a>b && a>c)
            System.out.println("A is Greatest among the three numbers");
        else if(b>a && b>c)
            System.out.println("B is Greatest among the three numbers");
        else 
            System.out.println("C is Greatest among the three numbers");
    }
}
