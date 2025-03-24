import java.util.Scanner;

public class Sumoftwoprimenumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int x = 0;
        for(int i=2;i<=a/2;i++){
            if(prime(i) == 1){
                if(prime(a-i) == 1){
                    System.out.println(a+ " = " + i + " + " +(a-i));
                    x = 1;
                }
            }
        }
        if(x==0){
            System.out.println("Th number cann't be expressed");
        }
    }
    public static int prime(int n){
        int c= 1;
        for(int i = 2;i<n;i++){
            if(n%i==0){
                c=0;
                break;
            }
        }
        return c;
    }
}
