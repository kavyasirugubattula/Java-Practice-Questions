import java.util.*;

public class BalanceBankAccount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of the number: ");
        int a = sc.nextInt();
        int[] digits = new int[a];
        for(int i=0;i<a;i++){
            digits[i]=sc.nextInt();
        }
        int num=0;
        for(int num1:digits){
            num = num*10+num1;
        }
        num++;
        System.out.print(num);
    }
}
