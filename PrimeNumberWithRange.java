public class PrimeNumberWithRange {
    public static void main(String[] args){
        int a =50;
        for(int i=0;i<=a;i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; 
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
