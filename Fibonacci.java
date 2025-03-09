public class Fibonacci {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;

        System.out.print(first+ " " + second + " ");

        int next;

        for(int i =3 ; i<=10;i++){
            next=first+second;
            System.out.print(" " +next + " ");
            first=second;
            second=next;
        }
    }
}
