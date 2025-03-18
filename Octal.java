import java.util.Scanner;

public class Octal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int Octal=0,n=0,temp;
        while(a>0){
            temp = a%10;
            Octal += temp*Math.pow(8,n);
            a /= 10;
            n ++;
        }
        System.out.println(Octal);
    }
}
