public class StrongNumber {
    public static void main(String[] args){
        int n = 145;
        int temp =n;
        int r,sum=0;
        while(temp !=0 ){
            r = temp%10;
            int a = fact(r);
            sum = sum+a;
            temp /= 10;
        }
        if(sum == n){
            System.out.println("It is a strong number");
        }
        else
            System.out.println("It is not a strong number");
    }
    public static int fact(int b){
        int x = 1;
        for(int i = 2 ;i<=b;i++){
            x = x*i;
        }
        return x;
    }
}
