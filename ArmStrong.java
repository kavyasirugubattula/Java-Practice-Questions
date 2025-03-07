public class ArmStrong {
    public static void main(String[] args){
        int n = 345;
        int len;
        len = order(n);
        if(armstrong(n,len)){
            System.out.println("It is a armstrong");
        }
        else{
            System.out.println("It is not a armstrong");
        }
    }
    static int order(int x){
        int len = 0;
        while(x!=0){
            len++;
            x=x/10;
        }
        return len;
    }
    static boolean armstrong (int num, int len)
  {

    int sum = 0, temp, digit;
    temp = num;

    // loop to extract digit, find power & add to sum
    while (temp != 0)
      {
	// extract digit
	digit = temp % 10;

	// add power to sum
	sum = sum + (int)Math.pow(digit, len);
	temp /= 10;
      }

    return num == sum;
  }
}
