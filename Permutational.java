import java.util.Scanner;

public class Permutational {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.print("Enter a number: ");
        int r=sc.nextInt();
        int fact1=1,fact2=1,per;
        for(int i=n;i>1;i=i-1){
            fact1 = fact1*i;
        }
        int number = n-r;
        for(int i=number;i>1;i=i-1){
            fact2 = fact2*i;
        }
        per=fact1/fact2;
        System.out.println(per);
    }
}
