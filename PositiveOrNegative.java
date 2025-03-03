import java.util.Scanner;

public class PositiveOrNegative{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = scanner.nextInt();
        if(a>=0){
            System.out.println("It is a positive number");
        }
        else{
            System.out.println("It is a negative number");
        }

    }
}