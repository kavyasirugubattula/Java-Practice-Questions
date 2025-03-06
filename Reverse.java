public class Reverse {
    public static void main(String[] args) {
        int a = 615297;
        int reverse = 0;
        int rem;
        while(a!=0){
            rem = a%10;
            reverse=reverse*10+rem;
            a/=10;
        }
        System.out.println(reverse);
    }
}
