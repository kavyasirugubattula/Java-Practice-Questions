public class LCM {
    public static void main(String[] args){
        int a=72,b=120;
        int lcm=(a>b)?a:b;
        while (true) { 
         if(lcm % a == 0 && lcm % b == 0){
            System.out.println("LCM of  entered numbers : "+lcm);
            break;
         }
         ++lcm;   
        }
    }
}
