public class Palindrome {
    public static void main(String[] args) {
     int a = 12321;
     int reverse=0;
     int rem;
     int tem=a;
     while(tem!=0){
        rem = tem%10;
        reverse=reverse*10+rem;
        tem/=10;
     }
     if(a==reverse){
        System.out.println("It is palindrome");
     }
     else
        System.out.println("It is not a palindrome");
    }
}
