public class FibonacciLastTerm {
    public static void main(String[] args){
        int first = 0;
        int Second = 1;
        int next;
        System.out.print(first + " " +  Second);
        for(int i = 3;i<=20;i++){
            next = first+Second;
            first = Second;
            Second = next;
            System.out.print(next);
        }
    }
}
