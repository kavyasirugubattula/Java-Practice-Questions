import java.util.Scanner;

public class FibonacciNterm {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
     int first = 0;
     int Second = 1;
     int a = sc.nextInt();
     System.out.print(first + " " + Second +" ");   
     int next;
     for(int i = 3;i<=a;i++){
        next = first+Second;
        System.out.print(" "+ next +" ");
        first = Second;
        Second = next;
     }
    }
}
