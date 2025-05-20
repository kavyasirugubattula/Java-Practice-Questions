import java.util.*;
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
        String binaryString = "0110";
        int decimalValue = Integer.parseInt(binaryString, 2);
        System.out.println("The decimal equivalent of binary" + binaryString + "is" +decimalValue);
        int decimalNumber = 10;
        String binaryNumber = Integer.toBinaryString(decimalNumber);
        System.out.println(binaryNumber);
    }
}
