import java.util.Scanner;

public class ArmStronginRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a start and end numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("ArmStrong numbers in given range: ");
        for(int i=a;i<=b;i++){
            int num = i;
            int temp = num;
            int sum = 0;
            while(temp!=0){
                int r = temp%10;
                temp /= 10;
                sum += r*r*r;
            }
            if(sum == num){
                System.out.println(num + " It is a armstrong number");
            }
        }
    }
}
