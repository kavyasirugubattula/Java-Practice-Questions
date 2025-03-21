
public class Co_Ordinate {
    public static void main(String[] args) {
        int i=-3,j=-33;
        if(i>0 && j>0){
            System.out.println("Quadrant is I");
        }
        else if(i<0 && j>0){
            System.out.println("Quadrant is II");
        }
        else if(i<0 && j<0){
            System.out.println("Quadrant is III");
        }
        else if(i>0 && j<0){
            System.out.println("Quadrant is IV");
        }
        else if(i==0 && j==0){
            System.out.println("Origin");
        }
        else if(i!=0 && j==0){
            System.out.println("X-axis");
        }
        else if(i==0 && j!=0){
            System.out.println("Y-axis");
        }
    }
}
