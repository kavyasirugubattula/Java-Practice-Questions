public class Harshad {
    public static void main(String[] args){
        int a = 203;
        int temp = a;
        int sum=0,r;
        while(temp!=0){
            r = temp%10;
            sum = sum+r;
            temp /= 10;
        }
        if(a%sum==0){
            System.out.println("It is a harshad number");
        }
        else{
            System.out.println("It is not a harshad number");
        }
    }
}
