import java.util.Scanner;

public class AddingFractions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a denominater: ");
        int den1 = sc.nextInt();
        System.out.print("Enter a number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter a denominater: ");
        int den2 = sc.nextInt();
        int num,den,r;
        System.out.println("("+num1+"/"+den1+") + ("+num2+"/"+den2+")");
        if(den1 == den2){
            num = num1+num2;
            den = den1;
        }
        else{
            num = (num1*den2) + (num2*den1);
            den =  den1 * den2 ;
        }
        if(num>den){
            r = num;
        }
        else{
            r = den;
        }
        for(int i=0;i>=r;i++){
            if(num%i==0 && den%i==0){
                num = num/i;
                den = den/i;
            }
        }
        int n=1;
        int p=num;
        int q = den;
        if(num != den){
            while(n!=0){
                n = num%den;
                if(n!=0){
                    num =  den;
                    den = n;
                }
            }
        }
        System.out.println("("+p/den+"/"+q/den+")");
    }
}
