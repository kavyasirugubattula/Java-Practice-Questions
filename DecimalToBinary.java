import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int i=0;
        int binary[] = new int[100];
        while(a>0){
            binary[i] = a%2;
            a /= 2;
            i++;
        }
        System.out.print("Binary value is: ");
        for(int j=i-1;j>=0;j--){
            System.out.print(binary[j]);
        }
    }
}
