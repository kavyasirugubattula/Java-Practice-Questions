public class Automorphic {
    public static void main(String[] args) {
        int a = 6;
        int b = a * a;
        if(a%10 == b%10)
           System.out.println("The number is automorphic");
        else
            System.out.println("It is not a automorphic");   
    }
}
