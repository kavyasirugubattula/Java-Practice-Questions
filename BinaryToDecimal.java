import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int decimal=0,n=0,temp;
        while(a>0){
            temp = a%10;
            decimal += temp*Math.pow(2,n);
            a /= 10;
            n++;
        }
        System.out.println(decimal);
    }
}
