import java.util.*;

public class Pangram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String a = sc.nextLine().toLowerCase();
        Set<Character> letters = new HashSet<>();
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if(ch >='a' && ch<='z'){
                letters.add(ch);
            }
        }
        if(letters.size()==26)
            System.out.println("Pangram");
        else
            System.out.println("Not Pangram");
    }
}
