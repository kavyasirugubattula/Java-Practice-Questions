import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int octal[] = new int[30];
        int i = 0;
        while(a > 0){
            octal[i] = a%8;
            a /= 8;
            i ++;
        }
        System.out.print("Octal number is: ");
        for(int j=i-1;j>=0;j--){
            System.out.print(octal[j]);
        }
        sc.close();
    }
}
