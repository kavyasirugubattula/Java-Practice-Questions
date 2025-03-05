import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        if(isPrime(a)){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }
    }

public static boolean isPrime(int n){
    if(n<=1)
    return false;
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
            return false; // Not a prime number
        }
    }
    
    return true; // Prime number
}
}

