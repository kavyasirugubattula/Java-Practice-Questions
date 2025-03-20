import java.util.Scanner;

public class Hexal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int hexal=0,n=0,temp;
        while(a>0){
            temp = a%10;
            hexal += temp*Math.pow(16,n);
            a /= 10;
            n++;
        }
        System.out.println(hexal);
    }
}
